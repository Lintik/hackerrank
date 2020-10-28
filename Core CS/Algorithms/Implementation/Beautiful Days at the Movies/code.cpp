#include <bits/stdc++.h>
using namespace std;

int main() {
    int m;
    cin >> m;
    int n;
    cin >> n;
    int k;
    cin >> k;
    int c = 0;
    for(int i = m; i <= n;i++){
        int r = 0;
        int temp = i;
        while(temp){
            r *= 10;
            r += temp % 10;
            temp /= 10;
        }
        if(abs(i - r) % k == 0) c++;
    }
    cout << c;
}
