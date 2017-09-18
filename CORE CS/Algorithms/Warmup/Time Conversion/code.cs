using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string timeConversion(string s) {
        // Complete this function
        string[] t = s.Split(':');
        if(s[8]=='A')
            if(t[0] == "12")
                return "00:" + t[1] + ":" + t[2].Substring(0,2);
            else
                return t[0] + ":" + t[1] + ":" + t[2].Substring(0,2);
        else{
            if(t[0] == "12")
                return "12:" + t[1] + ":" + t[2].Substring(0,2);
            if((Convert.ToInt32(t[0]) + 12)%24 < 10)
                return "0"+((Convert.ToInt32(t[0]) + 12)%24).ToString() + ":" + t[1] + ":" + t[2].Substring(0,2);
            else
                return ((Convert.ToInt32(t[0]) + 12)%24).ToString() + ":" + t[1] + ":" + t[2].Substring(0,2);
        }
    }

    static void Main(String[] args) {
        string s = Console.ReadLine();
        string result = timeConversion(s);
        Console.WriteLine(result);
    }
}
