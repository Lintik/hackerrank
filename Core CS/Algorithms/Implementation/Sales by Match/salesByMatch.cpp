#include <bits/stdc++.h>
using namespace std;

int sockMerchant(int n, vector <int> ar) {
    map<int, int> m;
    int r = 0;
    for(int a: ar){
        if(m.count(a) != 0)
            m[a]++;
        else
            m.insert(pair<int,int>(a,1));
    }

    for (auto const & [k, v] : m){
        r += v/2;
    }
    return r;
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = sockMerchant(n, ar);
    cout << result << endl;
    return 0;
}
