#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

//pass the vector by reference to meet speed requirements
string lowerBound(vector<int> &v, int y){
    int i = 0;
    i = lower_bound(v.begin(), v.end(),y) - v.begin();
    if(v[i] == y)
        return "Yes " + to_string(i + 1);//off by one
    else
        return "No " + to_string(i + 1);
    
}

int main(){
    int N = 0;
    cin >> N;
    vector<int> v(N);
    for(int i = 0;i < N;i++)
        cin >> v[i];
    int Q = 0;
    cin >> Q;

    for(int i = 0;i < Q;i++){
        int Y = 0;
        cin >> Y;
        cout << lowerBound(v,Y) << endl;
    }
}