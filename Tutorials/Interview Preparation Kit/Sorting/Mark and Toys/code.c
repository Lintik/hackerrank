#include <stdio.h>
#include <stdlib.h>

int cmpfunc(const void *a, const void *b){
     return (*(int *)a - *(int *)b); 
}

int main()
{
    int n, m, c = 0;
    scanf("%d", &n);
    scanf("%d", &m);
    int *a;
    a = (int*)(malloc(sizeof(int)*n));
    for(int i = 0; i < n;i++)
        scanf("%d", &a[i]);

    qsort(a, n, sizeof(int), cmpfunc);
    for(int i = 0; i < n && m > 0;i++){
        if(m - a[i] > 0)
            c++;
        m -= a[i];
    }
    printf("%d", c);
}
