#include <bits/stdc++.h>
using namespace std;

int migratoryBirds(int n, vector <int> ar) {
    int r[5] = {};

    for (auto a: ar)
        r[a-1]++;

    int mx = 0;
    int mx_i = 0;
    for(int i = 0;i < 5;i++){
        if(r[i] > mx){
            mx = r[i];
            mx_i = i;
        }
    }
    return mx_i + 1;
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = migratoryBirds(n, ar);
    cout << result << endl;
    return 0;
}
