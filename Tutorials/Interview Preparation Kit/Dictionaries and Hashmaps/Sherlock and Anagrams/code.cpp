#include <bits/stdc++.h>

using namespace std;

// Complete the sherlockAndAnagrams function below.
int sherlockAndAnagrams(string s) { 
    map<string, int> subs;
    map<string, int>::iterator it;
    int count = 0;
    int l = s.length();
    for(int i = l - 1; i > 0;i--)
        for(int j = 0;i + j <= l;j++){
            string t = s.substr(j,i);
            sort(t.begin(), t.end());
            if (subs.find(t) == subs.end())
                subs[t] = 1;
            else
                subs[t] += 1;
            
        }
    
    for ( it = subs.begin(); it != subs.end(); it++ ){
        int temp = it->second;
        if(temp > 1)
            count += (temp - 1) * temp / 2;
    }
    return count;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int q;
    cin >> q;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int q_itr = 0; q_itr < q; q_itr++) {
        string s;
        getline(cin, s);

        int result = sherlockAndAnagrams(s);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
