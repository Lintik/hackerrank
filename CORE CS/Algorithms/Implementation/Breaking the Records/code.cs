using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int maxc = 0,
            minc = 0,
            max = s[0],
            min = s[0];
        
        for(int i=1;i<s.Length;i++){
            if(max < s[i]){
                max = s[i];
                maxc++;
            }
            else if(min > s[i]){
                min = s[i];
                minc++;
            }
        }
        return new int[2]{maxc,minc};
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] s_temp = Console.ReadLine().Split(' ');
        int[] s = Array.ConvertAll(s_temp,Int32.Parse);
        int[] result = getRecord(s);
        Console.WriteLine(String.Join(" ", result));
    }
}
