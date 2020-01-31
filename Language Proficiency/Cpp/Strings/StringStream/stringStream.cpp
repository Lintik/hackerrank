#include <iostream>
#include <vector>
using namespace std;

vector<int> parseInts(string str) {
    stringstream ss(str);
    char ch;
    int a;
    vector<int> v;
    int n = count(str.begin(), str.end(), ',');
    for(int i = 0;i < n;i++){
        ss >> a >> ch;
        v.push_back(a);
    }
    ss >> a;
    v.push_back(a);
    return v;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
