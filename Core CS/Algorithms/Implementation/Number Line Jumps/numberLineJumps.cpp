#include <bits/stdc++.h>

using namespace std;

string numberLineJumps(int x1, int v1, int x2, int v2) {
    if(v2 >= v1) return "NO";
    return (x2-x1)%(v1-v2) == 0? "YES":"NO";
}

int main() {
    int x1;
    int v1;
    int x2;
    int v2;
    cin >> x1 >> v1 >> x2 >> v2;
    string result = numberLineJumps(x1, v1, x2, v2);
    cout << result << endl;
    return 0;
}
