#include <bits/stdc++.h>
using namespace std;

int monthToDays(m1){
    int[] m = [0, 31,59,90,120,151,181,212,243,273,304,334];
    return m[m1];
}

// Complete the libraryFine function below.
int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    int diff = 0;
    // convert the dates to days and find the difference
    int y = y1 - y2;
    int d = monthToDays(m1) + d1 - monthToDays(m2) - d2;
}

int main(){
    int d1, d2, m1, m2, y1, y2;
    cin >> d1 >> m1 >> y1 >> d2 >> m2 >> y2; 
    cout << libraryFine(d1, m1, y1, d2, m2, y2);
}
