#include <bits/stdc++.h>
using namespace std;

int main() {
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        int x;
        int y;
        int z;
        cin >> x >> y >> z;
        
        int xz = abs(x - z);
        int yz = abs(y - z);
        if(xz > yz) cout << "Cat B";
        else if(xz < yz) cout << "Cat A";
        else cout << "Mouse C";
        cout << endl;
    }
    
    return 0;
}
