#include <bits/stdc++.h>

using namespace std;

// Complete the checkMagazine function below.
void checkMagazine(vector<string> magazine, vector<string> note) {
    map<string, int> words;
    for(string word: magazine){
        if(words.find(word) == words.end())
            words[word] = 1;
        else
            words[word]++;
    }
    for(string word: note){
        if(words.find(word) == words.end()){
            cout << "No";
            return;
        }
        else{
            words[word]--;
            if(words[word] < 0){
                cout << "No";
                return;
            }
        }
    }
    cout << "Yes";
    return;

}

int main()
{
    int n, m;
    cin >> n >> m;
    vector<string> a;
    vector<string> b;
    string t;
    for(int i = 0; i < n;i++){
        cin >> t;
        a.push_back(t);
    }
    for (int i = 0; i < m; i++){
        cin >> t;
        b.push_back(t);
    }

    checkMagazine(a, b);
    return 0;
}
