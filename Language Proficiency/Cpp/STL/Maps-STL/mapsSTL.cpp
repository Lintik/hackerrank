#include <iostream>
#include <vector>
#include <set>
#include <map>
using namespace std;

void mapDisplay(map<string, int> &m){

}

void mapDelete(map<string, int> &m, string name){

}

void mapInsert(map<string, int> &m, int x){

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
            mapInsert(m, y);
        }
        else if(x == 2)
            mapDelete(m, name);
        else
            mapDisplay(m);
        
        
    }
}