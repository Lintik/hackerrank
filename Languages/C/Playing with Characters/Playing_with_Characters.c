#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch;
    scanf("%c", &ch);
    printf("%c\n", ch);
    scanf("\n");
    
    char s[256];
    scanf("%s" , s);
    printf("%s\n", s);
    scanf("\n");
    
    char sen[256];
    scanf("%[^\n]%*c", sen);
    printf("%s", sen);
    
    return 0;
}