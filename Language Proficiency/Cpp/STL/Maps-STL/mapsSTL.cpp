#include <iostream>
#include <vector>
#include <set>
#include <map>
using namespace std;

void mapDisplay(map<string, int> &m, string name){
    cout << m[name];
    cout << endl;
}

void mapDelete(map<string, int> &m, string name){
    m[name] = 0;
}

void mapInsert(map<string, int> &m, string name, int x){
    m.insert(pair<string,int>(name,0));
    m[name] += x;
}

int main(){
    int Q = 0;
    cin >> Q;
    map<string,int> m;
    for(int i = 0;i < Q;i++){
        int x = 0, y = 0;
        string name;
        cin >> x >> name;
        if(x == 1){
            cin >> y;
            mapInsert(m, name, y);
        }
        else if(x == 2)
            mapDelete(m, name);
        else
            mapDisplay(m, name);
        
        
    }
}