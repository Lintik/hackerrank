#include <bits/stdc++.h>

using namespace std;

int migratoryBirds(int n, vector <int> ar) {
    sort(ar.begin(),ar.end());
    
    int previous = ar[0];
    int popular = ar[0];
    int count = 1;
    int maxCount = 1;

    for (int i = 1; i < ar.size(); i++) {
        if (ar[i] == previous)
            count++;
        else {
            if (count > maxCount) {
                popular = ar[i-1];
                maxCount = count;
            }
            previous = ar[i];
            count = 1;
        }
    }

    return count > maxCount ? ar[ar.size()-1] : popular;
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = migratoryBirds(n, ar);
    cout << result << endl;
    return 0;
}
