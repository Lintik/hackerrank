#include <bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin >> n;
    int p;
    cin >> p;
    vector<int> a(n);
    int m = 0;
    for(int i = 0; i < n;i++){
        cin >> a[i];
        if(a[i] > m) m = a[i];
    }
    if(m > p)
        cout << m - p;
    else
        cout << 0;
    return 0;
    
}
