#include <stdio.h>

int main() {

    int n;
    int s = 0;
    scanf("%d",&n);
    int arr[n];
    for(int i = 0;i < n;i++){
        scanf("%d",&arr[i]);
        s += arr[i];
    }
    printf("%d",s);
    return 0;
}