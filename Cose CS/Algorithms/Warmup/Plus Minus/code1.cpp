#include<iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    float pl = 0, mn = 0, zr = 0;

    for (int i = 0; i < n; i++) {
        int val;
        cin >> val;
        zr += (val == 0);
        pl += (val > 0);
        mn += (val < 0);
    }
    
    zr = zr / (double)n;
    pl = pl / (double)n;
    mn = mn / (double)n;
    
    printf("%0.06lf\n%0.06lf\n%0.06lf\n", pl, mn, zr);
    return 0;
}
