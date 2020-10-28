#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int a, b, m, n, s, t;
    cin >> s >> t;
    cin >> a >> b;
    cin >> m >> n;
    int apple = 0;
    int orange = 0;
    for(int apple_i = 0;apple_i < m;apple_i++){
       int c; 
       cin >> c;
       c+=a;
       if(c >= s && c <= t) apple++;
    }
    for(int orange_i = 0;orange_i < n;orange_i++){
       int c; 
       cin >> c;
       c+=b;
       if(c >= s && c <= t) orange++;
    }
    cout << apple <<endl;
    cout << orange <<endl;
    return 0;
}
