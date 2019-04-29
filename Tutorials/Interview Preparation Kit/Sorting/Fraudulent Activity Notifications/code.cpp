#include <bits/stdc++.h>
using namespace std;

// Complete the activityNotifications function below.
int activityNotifications(vector<int> a, int d) {
    vector<int> b(d);
    int e = d/2;
    int count = 0;
    for(int i = 0; i < d;i++)
        b[i] = a[i];
    
    sort(b.begin(),b.end());

    for(int i = 0; i + d < a.size();i++){

        if (d % 2 == 1) { // check if odd
            if (b[e] * 2 <= a[i + d])
                count++;
        }
        else{
            if ((b[e] + b[e - 1]) <= a[i + d])
                count++;
        }
        b.erase(lower_bound(b.begin(), b.end(), a[i]));
        b.insert(upper_bound(b.begin(), b.end(), a[i + d]), a[i + d]);
    }
    return count;
}

int main()
{
    int n, d;
    scanf("%d", &n);
    scanf("%d", &d);
    vector<int> a(n);
    for(int i =0; i < n;i++)
        scanf("%d", &a[i]);
    int r = activityNotifications(a, d);
    printf("%d", r);
}
