#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n = 0;
    cin>>n;
    for(int i = 0;i<n;i++){
        for(int j = n;j>i+1;j--)
            cout<<' ';
        for(int k = i; k>-1;k--)
            cout<<'#';
        
        cout<<endl;
    }
    return 0;
}
