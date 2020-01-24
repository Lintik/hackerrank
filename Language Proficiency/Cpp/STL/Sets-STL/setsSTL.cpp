#include <iostream>
#include <set>
#include <vector>
#include <algorithm>
using namespace std;

void setsSTL(set<int> &s, int y, int x){
    if(y==1)
        s.insert(x);
    else if(y==2)
        s.erase(x);
    else if(s.find(x) != s.end())
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
}

int main(){
    int Q = 0;
    cin >> Q;
    set<int> s;
    for(int i = 0;i < Q;i++){
        int y = 0, x = 0;
        cin >> y >> x;
        setsSTL(s,y,x);
    }
}