#include <bits/stdc++.h>
using namespace std;

int subarrayDivision(int n, vector < int > s, int d, int m){
    int t=0,
        c=0;
    for(int i=0;i<m;i++) t+=s[i];

    if(t==d) c++;
    
    for(int i=m;i<n;i++){
        t = t - s[i-m] + s[i];
        if(t==d) c++;
    }
    return c;
}

int main() {
    int n;
    cin >> n;
    vector<int> s(n);
    for(int s_i = 0; s_i < n; s_i++){
       cin >> s[s_i];
    }
    int d;
    int m;
    cin >> d >> m;
    int result = subarrayDivision(n, s, d, m);
    cout << result << endl;
    return 0;
}
