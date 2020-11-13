using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string DayOfTheProgrammer(int year){
        int mon7 = 215;
        int feb; //days in february
        if(year < 1918) //julian
            feb = year%4>0 ? 28 : 29;
        else if(year > 1918) //gregorian
            feb = !(year%400 >0) || year%100>0 && !(year%4>0) ? 29 : 28;
        else // 1918
            feb = 15;
        feb = 256 - (feb + mon7);
        return feb.ToString() + ".09." + year.ToString();
    }

    static void Main(String[] args) {
        int year = Convert.ToInt32(Console.ReadLine());
        string result = DayOfTheProgrammer(year);
        Console.WriteLine(result);
    }
}
