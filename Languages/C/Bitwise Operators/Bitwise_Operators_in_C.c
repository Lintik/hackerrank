#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
    int t = 0;
    int u = 0;
    int v = 0;
    for(int i = 1; i <= k;i++){
        for(int j = i + 1; j <= n && i < j;j++){
            if(t < (i & j) && (i & j) < k) t = i & j;
            if(u < (i | j) && (i | j) < k) u = i | j;
            if(v < (i ^ j) && (i ^ j) < k) v = i ^ j;
        }
    }
    printf("%d\n", t);
    printf("%d\n", u);
    printf("%d", v);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
