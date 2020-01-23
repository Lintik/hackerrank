#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> sortVector(vector<int> v){
    //sort does not return the sorted array
    sort(v.begin(),v.end());
    return v;
}

int main() {
    int N = 0;
    cin >> N;
    vector<int> v(N);
    for(int i = 0; i < N;i++)
        cin >> v[i];

    v = sortVector(v);
    for(auto i: v)
        cout << i << " ";
    return 0;
}
