using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] r = new int[5];
    
        foreach(int a in ar)
            r[a-1]++;
            
        int mx = 0;
        int mx_i = 0;
        for(int i = 0;i < 5;i++){
            if(r[i] > mx){
                mx = r[i];
                mx_i = i;
            }
        }
        return mx_i + 1;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] ar_temp = Console.ReadLine().Split(' ');
        int[] ar = Array.ConvertAll(ar_temp,Int32.Parse);
        int result = migratoryBirds(n, ar);
        Console.WriteLine(result);
    }
}
