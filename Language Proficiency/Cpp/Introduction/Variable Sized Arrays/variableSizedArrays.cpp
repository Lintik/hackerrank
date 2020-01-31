#include <iostream>
using namespace std;

int main() {
    int n, q;
    cin >> n >> q;
    int* a[n];
    for(int i = 0; i < n; i++){
        int m;
        cin >> m;
        a[i] = new int[m];
        for(int j = 0;j < m;j++){
            cin >> a[i][j]; 
        }
    }
    for(int i = 0;i < q;i++){
        int x, y;
        cin >> x >> y;
        cout << a[x][y] << endl;
    }
    return 0;
}
