#include <stdio.h>

int main() {
    
    char c;
    int d[10] = {0,0,0,0,0,0,0,0,0,0};
    while(scanf("%c", &c) == 1)
        if(c >= '0' && c <= '9')
            (*(d+(c-'0')))++;
    
    for(int i = 0; i < 10; i++)
        printf("%d ", *(d+i));
}