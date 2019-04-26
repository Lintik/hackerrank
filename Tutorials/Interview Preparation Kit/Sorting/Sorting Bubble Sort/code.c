#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char** split_string(char*);

// Complete the countSwaps function below.
void countSwaps(int a_count, int* a) {
    int count = 0;
    for (int i = 0; i < a_count; i++) {
        for (int j = 0; j < a_count - 1; j++) {
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
    printf("Last Element: %d\n", a[a_count - 1]);
}

int main()
{
    int n = 0;
    scanf("%d", &n);
    int* a;
    a = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
      scanf("%d", &a[i]);
    }

    countSwaps(n, a);
    return 0;
}
