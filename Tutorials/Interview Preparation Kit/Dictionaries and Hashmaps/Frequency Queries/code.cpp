#include <bits/stdc++.h>
using namespace std;

map<int, int> c, f;

int main() {
    int n;
    cin >> n;
    int a[n], b[n];

    for (int i = 0; i < n; i++){
        scanf("%d", &a[i]);
        scanf("%d", &b[i]);
    }

    for (int i = 0; i < n; i++) {
        // insert query
        if (a[i] == 1) {
            int k = c[b[i]];
            // decrease count of present frequency
            if (k > 0)
            f[k]--;
            // increase occurence of a number
            c[b[i]]++;
            // increase count of present frequency + 1
            f[k + 1]++;
        }

        // delete query
        else if (a[i] == 2) {
            int k = c[b[i]];
            if (k > 0) {
            // decrease occurence of a number
            c[b[i]]--;
            // decrease count of present frequency
            f[k]--;
            // increase count of present frequency - 1
            if (k - 1 > 0)
                f[k - 1]++;
            }
        } else {
            // true if the count of asked frequency is non-zero
            if (f[b[i]] > 0)
                printf("1\n");
            else
                printf("0\n");
        }
    }
    return 0;
}