using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int SubarrayDivision(int n, int[] s, int d, int m){
        int t=0,
            c=0;
        
        for(int i=0;i<m;i++) t+=s[i];
        if(t==d) c++;
        
        for(int i=m;i<n;i++){
            t = t - s[i-m] + s[i];
            
            if(t==d) c++;
        }
        return c;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] s_temp = Console.ReadLine().Split(' ');
        int[] s = Array.ConvertAll(s_temp,Int32.Parse);
        string[] tokens_d = Console.ReadLine().Split(' ');
        int d = Convert.ToInt32(tokens_d[0]);
        int m = Convert.ToInt32(tokens_d[1]);
        int result = SubarrayDivision(n, s, d, m);
        Console.WriteLine(result);
    }
}
