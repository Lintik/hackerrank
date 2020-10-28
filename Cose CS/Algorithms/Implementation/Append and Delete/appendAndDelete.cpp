#include <bits/stdc++.h>
using namespace std;

string appendAndDelete(string s, string t, int k) {
    int commonLength = 0;
    int l1 = s.length();
    int l2 = t.length();
    for (int i=0; i<min(l1,l2);i++){
        if (s[i]==t[i])
            commonLength++;
        else
            break;
    }
    if((l1 + l2 - 2*commonLength)>k) return "No";
    else if((l1 + l2 - 2*commonLength)%2==k%2) return "Yes";
    else if((l1 + l2-k) < 0) return "Yes";
    else return "No";
    
}

int main() {
    string s;
    cin >> s;
    string t;
    cin >> t;
    int k;
    cin >> k;
    string result = appendAndDelete(s, t, k);
    cout << result << endl;
    return 0;
}
