#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> vectorErase(vector<int> v, int x){
    v.erase(v.begin() + x - 1);
    return v;
}

vector<int> vectorErase(vector<int> v, int a, int b){
    v.erase(v.begin() + a - 1, v.begin() + b -1);
    return v;
}

int main(){
    int N = 0;
    cin >> N;
    vector<int> v(N);
    for(int i = 0;i < N;i++)
        cin >> v[i];
    
    int x = 0;
    cin >> x;
    v = vectorErase(v, x);

    int a = 0, b = 0;
    cin >> a >> b;
    v = vectorErase(v, a, b);

    cout << v.size() << endl;
    for(auto i: v)
        cout << i << " ";
    return 0;

}