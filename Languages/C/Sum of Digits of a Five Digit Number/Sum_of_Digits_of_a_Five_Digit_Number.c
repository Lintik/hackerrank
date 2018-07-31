#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    int t = 0;
    for(int i = 0;i<5;i++){
        t += n % 10;
        n /= 10;
    }
    printf("%d",t);
    return 0;
}