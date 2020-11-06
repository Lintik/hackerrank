using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string NumberLineJumps(int x1, int v1, int x2, int v2) {
        if(v2 >= v1) return "NO";
        while(x1 < x2){
            x1+=v1;
            x2+=v2;
        }
        if(x1==x2) return "YES";
        else return "NO";
    }

    static void Main(String[] args) {
        string[] tokens_x1 = Console.ReadLine().Split(' ');
        int x1 = Convert.ToInt32(tokens_x1[0]);
        int v1 = Convert.ToInt32(tokens_x1[1]);
        int x2 = Convert.ToInt32(tokens_x1[2]);
        int v2 = Convert.ToInt32(tokens_x1[3]);
        string result = NumberLineJumps(x1, v1, x2, v2);
        Console.WriteLine(result);
    }
}
