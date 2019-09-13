#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    for(int i = 0; i < t;i++){
        int n;
        cin >> n;
        int m;
        cin >> m;
        int s;
        cin >> s;
        cout << ((m + s - 2) % n) + 1 << endl; 
    }
    return 0;
}
