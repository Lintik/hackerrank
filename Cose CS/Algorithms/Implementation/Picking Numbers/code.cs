using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static int MinAbsoluteDifference(int[] a){
        Array.Sort(a);
        if(a.Length == 1){
            return 1;
        }
        int m = 0; 
        int c1 = 1,
            c2 = 0;
        int prev = a[0];
        for(int i = 1; i < a.Length;i++){
            if(a[i] == prev)
                c1++;
            else if (a[i] == prev + 1)
                c2++;
            else{
                if(m < c1 + c2)
                    m = c1 + c2;
                if(a[i] - 1 == prev + 1){
                    c1 = c2;
                    c2 = 1;
                    prev = a[i] - 1;
                } 
                else{
                    prev = a[i];
                    c1 = 1;
                    c2 = 0;
                }
            }
        }
        if(m < c1 + c2)
            m = c1 + c2;
        return m;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] a_temp = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(a_temp,Int32.Parse);
        Console.WriteLine(MinAbsoluteDifference(a));
    }
}
