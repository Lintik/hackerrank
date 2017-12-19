#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, q;
    cin >> n;
    cin >> k;
    cin >> q;
    vector<int> a(n);
    vector<int> b(n);
    vector<int> m(q);
    for(int i = 0;i < n; i++)
        cin >> a[i];  
    for(int i = 0;i < n;i++){
        b[i] = a[(i + (n-(k%n)))%n];
    }
    for(int i = 0;i < q;i++){
        int j;
        cin >> j;
        cout << b[j] << endl;
    }
    return 0;
}
