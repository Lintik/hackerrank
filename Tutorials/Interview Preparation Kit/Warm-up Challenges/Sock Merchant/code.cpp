#include <bits/stdc++.h>

using namespace std;

int sockMerchant(int n, vector <int> ar) {
    // Complete this function
    sort(ar.begin(),ar.end());
    int t=0;
    int c=1;
    int prev = ar[0];
    for(int i = 1;i<n;i++){
        if(prev == ar[i])
            c++;
        else{
            t+=c/2;
            c=1;
            prev=ar[i];
        }
    }
    t+=c/2;
    return t;
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