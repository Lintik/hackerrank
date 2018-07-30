#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	  printf("Hello, World!\n");
    char s[100];
    scanf("%[^\n]%*c", s);
  	printf("%s", s);
    
    return 0;
}