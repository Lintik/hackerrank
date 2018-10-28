#include <stdio.h>
#include <stdlib.h>

int main(){
    int n, k, i, j; 
   
    scanf("%d %d",&n,&k);
    int *a = malloc(sizeof(int) * n);
    int *b = malloc(sizeof(int) * n);
    
    for(int a_i = 0; a_i < n; a_i++)
       scanf("%d",&b[a_i]);

    for(i=0; i<n; i++){
       j = ((i - k)% n + n) % n;
       a[j] = b[i] ;    
    }
    
    for(i=0; i<n; i++)
       printf("%d ", a[i]);
    
    free(a);
    free(b);

    return 0;
}