#include <bits/stdc++.h>
using namespace std;

int main() {
    int max = INT_MAX;
    int a[9];
    vector<vector<int>> valid_squares = {{8,1,6,3,5,7,4,9,2}, 
                                         {4,3,8,9,5,1,2,7,6}, 
                                         {2,9,4,7,5,3,6,1,8},
                                         {6,7,2,1,5,9,8,3,4},
                                         {6,1,8,7,5,3,2,9,4},
                                         {8,3,4,1,5,9,6,7,2},
                                         {4,9,2,3,5,7,8,1,6},
                                         {2,7,6,9,5,1,4,3,8}};
    
    for(int i = 0;i < 9;i++) 
        cin >> a[i];
    for(int i = 0;i < 8;i++){
        int diff = 0;
        for(int j = 0;j < 9;j++) 
            diff += abs(a[j]-valid_squares[i][j]);
        if (diff < max) 
            max = diff;
    }
    cout<<max<<endl;
    return 0;
}
