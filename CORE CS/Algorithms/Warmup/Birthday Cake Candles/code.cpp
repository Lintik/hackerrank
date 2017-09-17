#include <bits/stdc++.h>

using namespace std;

int birthdayCakeCandles(int n, vector <int> ar) {
    // Complete this function
    int mx = 0;
    int c = 1;
    for(int i = 0; i<n;i++){
        if(ar[i]>mx){ 
            mx = ar[i];
            c = 1;
        }
        else if(mx==ar[i])c++;
        else continue;
    }
    return c;
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = birthdayCakeCandles(n, ar);
    cout << result << endl;
    return 0;
}
