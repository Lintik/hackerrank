#include <bits/stdc++.h>

using namespace std;

// Complete the freqQuery function below.
vector<int> freqQuery(vector<vector<int>> queries) {
    map<int , int> c;
    map<int , int> f;
    vector<int> r;
    for (int i = 0; i < queries.size(); i++) {
        int type = queries[i][0];
        int n = queries[i][1];
        if (type == 1) {
            if (c.find(n) != c.end()) { // 2-nth insertion
                int m = c[n]++;
                int m1 = m + 1;

                if (f.find(m1) != f.end())
                    f[m1]++;
                else
                    f[m1] = 1;

                if (f.find(m) != f.end()) {
                    f[m]--;
                    if (f[m] < 1)
                    f.erase(m);
                }
            } 
            else { // first insertion
                c[n] = 1;
                if (f.find(1) != f.end())
                    f[1]++;
                else
                    f[1] = 1;
            }
      } else if (type == 2) {
            if (c.find(n) != c.end()) {
                int m = c[n]--;
                int m1 = m - 1;

                if (m1 <= 0) {
                    c.erase(n);
                }
                if (f.find(m)!= f.end()) {
                    f[m]--;
                    if (f[m] <= 0)
                    f.erase(m);
                }
                if (f.find(m1)!= f.end()) 
                    f[m1]++;
                else 
                    f[m1] = 1;

            } 
            else  // no occurence detected
                continue;
        } 
        else {
            if (f.find(n) != f.end())
                r.push_back(1);
            else
                r.push_back(0);
        }
    }
    return r;
}

int main()
{
    int n = 0, x, y;
    cin >> n;
    vector<vector<int>> a;
    for(int i = 0; i < n;i++){
        vector<int> b;
        cin >> x;
        cin >> y;
        b.push_back(x);
        b.push_back(y);
        a.push_back(b);
    }

    vector<int> c = freqQuery(a);
    for(int i = 0; i < c.size();i++){
        if(c[i] == 0) 
            cout << 0 << endl;
        else 
            cout << 1 << endl;
    }
}

