#include <bits/stdc++.h>
using namespace std;

string timeConversion(string s) {
    if(s[8] == 'P')
        if(s.substr(0,2) == "12")
            return s.substr(0,8);
        else
            return to_string(stoi(s.substr(0,2)) + 12) + s.substr(2,6);
    else
        if(s.substr(0,2) == "12")
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
