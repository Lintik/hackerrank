#include <cstdio>
#include <iostream>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    float cp=0;
    float cn=0;
    float c0=0;
    for(int i=0;i<n;i++){
        if(arr[i] > 0) cp++;
        else if(arr[i] < 0) cn++;
        else c0++;
    }
    printf("%0.06lf\n%0.06lf\n%0.06lf\n", cp, cn, c0);
    return 0;
}
