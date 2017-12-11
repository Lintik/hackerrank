#include <bits/stdc++.h>
using namespace std;
int minAbsoluteDifference(vector<int> a){ 
    sort(a.begin(), a.end());
    if(a.size() == 1){
        return 1;
    }
    int m = 0;
    int c1 = 1;
    int c2 = 0;
    int prev = a[0];
    for(int i = 1; i < a.size();i++){
        if(a[i] == prev)
            c1++;
        else if (a[i] == prev + 1)
            c2++;
        else{
            if(m < c1 + c2)
                m = c1 + c2;
            if(a[i] - 1 == prev + 1){
                c1 = c2;
                c2 = 1;
                prev = a[i] - 1;
            } 
            else{
                prev = a[i];
                c1 = 1;
                c2 = 0;
            }
        }
    }
    if(m < c1 + c2)
        m = c1 + c2;
    return m;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for(int i = 0; i < n;i++){
        cin >> a[i];
    }
    cout << minAbsoluteDifference(a) << endl;
    return 0;
}
