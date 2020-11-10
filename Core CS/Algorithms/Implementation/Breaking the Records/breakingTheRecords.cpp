#include <bits/stdc++.h>
using namespace std;

vector < int > getRecord(vector < int > s){
    int maxc = 0,
        minc = 0,
        max = s[0],
        min = s[0];
        
    for(int i=1;i<s.size();i++){
        if(max < s[i]){
            max = s[i];
            maxc++;
        }
        else if(min > s[i]){
            min = s[i];
            minc++;
        }
    }
    vector<int> r{maxc,minc};
    return r;
}

int main() {
    int n;
    cin >> n;
    vector<int> s(n);
    for(int s_i = 0; s_i < n; s_i++){
       cin >> s[s_i];
    }
    vector < int > result = getRecord(s);
    string separator = "", delimiter = " ";
    for(auto val: result) {
        cout<<separator<<val;
        separator = delimiter;
    }
    cout<<endl;
    return 0;
}
