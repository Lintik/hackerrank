#include<bits/stdc++.h>
using namespace std;

vector<int> findRank(vector<int> score, int n, vector<int> a, int m){
    score.erase(unique( score.begin(), score.end() ), score.end() );
    int j = score.size() - 1;
    for(int i = 0; i < a.size();i++){
        while(j>=0){
            if(a[i] < score[j]){
                a[i] = j + 2;
                break;
            }
            else if(a[i] == score[j]){
                a[i] = j + 1;
                break;
            }
            else if(a[i] >= score[0]){
                a[i] = 1;
                break;
            }
            j--;
        }
    }
    return a;
}
int main() {
    int n;
    cin >> n;
    vector<int> score(n);
    for(int i = 0; i < n;i++){
        cin >> score[i];
    }
    int m;
    cin >> m;
    vector<int> a(m);
    for(int i = 0; i < m;i++){
        cin >> a[i];
    }
    vector<int> r = findRank(score, n, a, m);
    for(int i = 0; i < m; i++)
        cout << r[i] << endl;
    return 0;
}
