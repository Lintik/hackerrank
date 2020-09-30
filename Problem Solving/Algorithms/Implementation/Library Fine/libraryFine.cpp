#include <bits/stdc++.h>
using namespace std;

int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    if(y1 < y2 || (y1 == y2 && m1 <= m2 && d1 <= d2)){
        return 0;
    }
    else if (y1 == y2 && m1 == m2 && d1 > d2){
        return 15 * (d1 - d2);
    }
    else if (y1 == y2 && m1 > m2){
        return 500 * (m1 - m2);
    }
    else{
        return 10000;
    }
}

int main(){
    int d1, d2, m1, m2, y1, y2;
    cin >> d1 >> m1 >> y1 >> d2 >> m2 >> y2; 
    cout << libraryFine(d1, m1, y1, d2, m2, y2);
}
