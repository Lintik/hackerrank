#include <stdio.h>
#include <stdlib.h>

int median(int* count, int d){
    int d2 = (d+1)/2;
    for (int i = 0; i < 201; i++){
        if (count[i] > d2) return 2*i;
        if (count[i] == d2){
            if (d%2 != 0) return 2*i;
            for (int j = i + 1; j < 201; j++)
                if (count[j] > 0) return i+j;
        }
        d2 -= count[i];
    }
    return 0;
}

int activityNotifications(int n, int* a, int d) {
    int result = 0;
    int count[201] = {0};

    for (int i = 0; i < n; i++){
        int v = a[i];
        if (i >= d){
            int m = median(count, d);
            if (v >= m) result++;
            count[a[i - d]]--;
        }
        count[v]++;
    }
    return result;
}

int main(){
    int n, d;
    scanf("%d", &n);
    scanf("%d", &d);
    int* a = malloc(n * sizeof(int));
    for(int i =0; i < n;i++)
        scanf("%d", &a[i]);
    int r = activityNotifications(n, a, d);
    printf("%d", r);
}
    
