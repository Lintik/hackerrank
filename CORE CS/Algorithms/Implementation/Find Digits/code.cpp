#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    for(int i = 0; i < t; i++){
        int n;
        cin >> n;
        int r = n;
        int count = 0;
        while(r > 0){
            if(r % 10 != 0 && n % (r % 10) == 0) count++;
            r /= 10;
        }
        cout << count << endl;
    }
    return 0;
}
