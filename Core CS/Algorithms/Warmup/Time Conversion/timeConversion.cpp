#include <bits/stdc++.h>
using namespace std;

string timeConversion(string s) {
    int h = stoi(s.substr(0,2));
    
    if(s[8] == 'P'){
        h += 12;
        if(h == 24)
            return s.substr(0,8);
        else{   
            string hh = to_string(h);
            return hh + s.substr(2,6);
        }
    }
    else
        if(h == 12)
            return "00" + s.substr(2,6);
        else
            return s.substr(0,8);    
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
