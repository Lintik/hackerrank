#include <limits.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    long int N, K, p, q, sum, i, j, max = 0, x = 0;

    scanf("%li", &N);
    scanf("%li", &K);

    long int *a;
    a = (long int *)calloc(N + 1, sizeof(long int));

    for (i = 0; i < K; i++) {
        scanf("%li", &p);
        scanf("%li", &q);
        scanf("%li", &sum);
        a[p] += sum;
        if ((q + 1) <= N)
            a[q + 1] -= sum;
    }

    for (i = 1; i <= N; i++) {
        x = x + a[i];
        if (max < x)
            max = x;
    }
    printf("%li",max);
    return 0;
}
