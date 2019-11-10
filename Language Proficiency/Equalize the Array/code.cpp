#include <bits/stdc++.h>
using namespace std;

int findMostFrequentNumber(vector<int> arr){
    map<int, int> m;
    int mx = 0;
    for(auto i: arr){
        m[i] += 1;
        if(mx < m[i])
            mx = m[i];
    }
    return arr.size() - mx;

}

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0;i < n;i++){
        cin >> arr[i];
    }
    cout << findMostFrequentNumber(arr);
    return 0;
}