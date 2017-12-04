#include <bits/stdc++.h>

using namespace std;

int getMoneySpent(vector < int > keyboards, vector < int > drives, int s){
    sort(keyboards.rbegin(), keyboards.rend());
    sort(drives.rbegin(), drives.rend());
    
    int k = keyboards.size();
    int d = drives.size(); v 
    int max = 0;
    for(int i = 0; i < k; i++){
        for(int j = 0; j < d;j++){
            int t = keyboards[i] + drives[j];
            if(t == s)
                return s;
            else if(t < s){
                if(max < t) max = t;
                break;
            }
            else continue;
        }
    }
    if(max == 0) return -1;
    else return max;
    
}

int main() {
    int s;
    int n;
    int m;
    cin >> s >> n >> m;
    vector<int> keyboards(n);
    for(int keyboards_i = 0; keyboards_i < n; keyboards_i++){
       cin >> keyboards[keyboards_i];
    }
    vector<int> drives(m);
    for(int drives_i = 0; drives_i < m; drives_i++){
       cin >> drives[drives_i];
    }
    
    int moneySpent = getMoneySpent(keyboards, drives, s);
    cout << moneySpent << endl;
    return 0;
}
