#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for(int i = 0; i < n; i++){
        cin >> a[i];
        int m = ~(~1<<(a[i]>>1)) << a[i]%2;
        cout << m << endl;
    }
    return 0;
}
