#include <bits/stdc++.h>
using namespace std;

int main(){
    long long s[5];
    long long d = 0;
    for(int i = 0; i < 5; i++){
        cin >> s[i];
        d += s[i];
    }
    sort(s,s+5);
    cout << d-s[4] << " " << d-s[0] << endl;
}
