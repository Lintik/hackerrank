#include <bits/stdc++.h>
using namespace std;

int count = 0;

vector<int> mergeSort(vector<int> arr){
    if(arr.size() == 1) return arr;
    int l = arr.size() /2;
    vector<int> l1 = 
}

void countInversions(vector<int> arr) {
    vector<int> a = mergeSort(arr);
}

int main()
{
    int t;
    cin >> t;

    for (int i = 0;i < t;i++) {
        int n;
        count = 0;
        cin >> n;
        vector<int> a(n);
        for(int j = 0;j < n;j++)
            cin >> a[j];
        countInversions(a);
        cout << count << endl;
    }
    return 0;
}
