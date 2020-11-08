#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b){
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
}

int gcd(int a[], int n){
    int ans = a[0];
    for (int i = 1; i < n; i++) {
        ans = gcd(ans, a[i]);
    }
    return ans;
}

int lcm(int a, int b){
    return a * (b / gcd(a, b));
}

int lcm(int a[], int m){
    int ans = a[0]; 
  
    for (int i = 1; i < m; i++) 
        ans = (((a[i] * ans)) / 
                (gcd(a[i], ans))); 
  
    return ans; 
}

int getTotalX(int a[], int b[], int m, int n) {
    int l = lcm(a, m);
    int g = gcd(b, n);
    
    int count = 0;
    for(int i = l, j =2; i<=g; i=l*j,j++){
        if(g%i==0)
            count++;
    }
    return count;
}

int main(){
    int m, n;
    cin >> m >> n;
    
    int a[m];
    int b[n];
    
    for(int i = 0;i < m;i++)
        cin >> a[i];
        
    for(int i = 0;i < n;i++)
        cin >> b[i];
        
    cout << getTotalX(a,b,m,n);
}