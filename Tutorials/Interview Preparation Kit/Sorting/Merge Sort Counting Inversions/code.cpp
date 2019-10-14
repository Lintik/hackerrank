#include <bits/stdc++.h>
using namespace std;

long count_s = 0;

vector<int> merge(vector<int> l1, vector<int> l2, int l){
    vector<int> c(l);
    int i = 0, j = 0, k = 0;
    while(i < l1.size() && j < l2.size()){
        if(l1[i] > l2[j]){
            c[k++] = l2[j++];
            count_s += l1.size() - i;
        } 
        else{
            c[k++] = l1[i++];
        }
    }
    while(i < l1.size())
        c[k++] = l1[i++];
    
    while(j < l2.size())
        c[k++] = l2[j++];

    return c;
}

vector<int> mergeSort(vector<int> arr){
    if(arr.size() == 1) return arr;
    int l = arr.size() /2;
    vector<int> l1(l);
    vector<int> l2(arr.size() - l);

    copy(arr.begin(), arr.begin() + l, l1);
    copy(arr.begin() + l + 1, arr.end(), l2);

    l1 = mergeSort(l1);
    l2 = mergeSort(l2);
    return merge(l1,l2, arr.size());

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
        count_s = 0;
        cin >> n;
        vector<int> a(n);
        for(int j = 0;j < n;j++){
            cin >> a[j];
        }

        countInversions(a);
        cout << count_s << endl;
    }
    return 0;
}
