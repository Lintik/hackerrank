#include <bits/stdc++.h>

using namespace std;

string dayOfTheProgrammer(int year){
    int mon7 = 215;
    short int feb; //days in february
    if(year < 1918) //julian
        feb = year%4 ? 28 : 29;
    else if(year > 1918) //gregorian
        feb = !(year%400) || year%100&&!(year%4) ? 29 : 28;
    else // 1918
        feb = 15;
    feb = 256 - (feb + mon7);
    return to_string(feb) + ".09." + to_string(year);
}

int main() {
    int year;
    cin >> year;
    string result = dayOfTheProgrammer(year);
    cout << result << endl;
    return 0;
}
