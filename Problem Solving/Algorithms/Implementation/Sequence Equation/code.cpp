#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> p_inverse(n+1);
    for(int i = 1; i <= n;i++){
        int px;
        cin >> px; 
        p_inverse[px] = i;
    }
    for (int x = 1; x <= n; x++) {
        int y = p_inverse[p_inverse[x]];
        cout << y << endl;
    }
    return 0;
}
