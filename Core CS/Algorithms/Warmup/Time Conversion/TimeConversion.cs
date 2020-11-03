using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string timeConversion(string s) {
        if(s[8]=='A')
            if(s.Substring(0,2) == "12") return "00" + s.Substring(2,6);
            else return s.Substring(0,8);
        else
            if(s.Substring(0,2) == "12") return s.Substring(0,8);
            else return ((Convert.ToInt32(s.Substring(0,2)) + 12)%24).ToString() + s.Substring(2,6);
    }

    static void Main(String[] args) {
        string s = Console.ReadLine();
        string result = timeConversion(s);
        Console.WriteLine(result);
    }
}
