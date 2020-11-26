#include <bits/stdc++.h>
using namespace std;

int countValley(int n, vector<char> ar){
    int depth = 0;
    int t = 0;
    for(int i = 0; i < n;i++){
        if(depth < 0){
            ar[i]=='U'? depth++:depth--;
            if(depth == 0) t++;
        }
        else
            ar[i]=='U'? depth++:depth--;
    }
    return t;
}

int main() {
    int n;
    cin >> n;
    vector<char> ar(n);
    for(int i = 0; i < n;i++)
        cin >> ar[i];
    int result = countValley(n, ar);
    cout << result <<endl;
    return 0;
}
