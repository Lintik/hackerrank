#include <bits/stdc++.h>
using namespace std;

void bonAppetit(int k, int b, vector <int> ar) {
    int s = 0 - ar[k];
    for(int a: ar)
        s += a;
        
    if(b - s/2 == 0)
        cout << "Bon Appetit";
    else
        cout << b - s/2;
}

int main() {
    int n;
    int k;
    cin >> n >> k;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int b;
    cin >> b;
    bonAppetit(k, b, ar);
}
