#include <bits/stdc++.h>

using namespace std;

// Complete the countSwaps function below.
void countSwaps(vector<int> a) {
    int count = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    count++;
                }
            }
        }
        printf("Array is sorted in %d swaps.\n", count);
        printf("First Element: %d\n", a[0]);
        printf("Last Element: %d\n", a[a.size()-1]);

}

int main()
{
    int n;
    scanf("%d", &n);
    vector<int> a(n);
    for(int i = 0; i < n;i++){
        cin >> a[i];
    }

    countSwaps(a);
    return 0;
}
