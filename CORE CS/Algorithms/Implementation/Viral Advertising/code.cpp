#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> m(n+1);
    m[0] = 2;
    for(int i = 0; i < n - 1;i++)
        m[i+1] = 3*m[i]/2;
    int t = 0;
    for(int i: m)
        t += i;
    cout << t;
    return 0;
}
