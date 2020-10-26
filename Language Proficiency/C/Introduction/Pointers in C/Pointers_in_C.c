#include <stdio.h>

void update(int *a,int *b) {
    int t = *a;
    *a = *a + *b;
    *b = t - *b > 0? t - *b: -1 * (t - *b);
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}