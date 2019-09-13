#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, p, E;
    cin >> n;
    cin >> k;
    vector<int> N(n);
    for(int i = 0;i < n;i++)
        cin >> N[i];
    
    for(int i = 0, E = 100, p = 0; E >= 0;i++){
        E--;
        p += k % n;
        p = p % n;
        if(N[p] == 1) E -= 2;
        if(p == 0){
            cout << E;
            return 0;
        }
    }
    return 0;
}
