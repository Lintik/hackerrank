#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<int> h(26);
    for(int i = 0; i < 26; i++)
        cin >> h[i];
    string word;
    cin >> word;
    int m = 0;
    for(char letter: word){
        if(h[letter - 'a'] > m)
            m = h[letter - 'a'];
    }
    cout << word.length() * m;
    return 0;
}
