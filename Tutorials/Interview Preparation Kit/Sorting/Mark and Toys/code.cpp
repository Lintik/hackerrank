#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m, c = 0;
    scanf("%d", &n);
    scanf("%d", &m);
    vector<int> a(n);
    for (int i = 0; i < n; i++)scanf("%d", &a[i]);

    sort(a.begin(), a.end());

    for (int i = 0; i < n && m > 0; i++) {
        if (m - a[i] > 0)
            c++;
        m -= a[i];
    }
    printf("%d", c);
}
