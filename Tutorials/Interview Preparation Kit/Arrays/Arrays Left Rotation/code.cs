using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int n = a.Length;
        int[] b = new int[n];
        d = d % n;
        for(int i = d; i < n;i++)
            b[i - d] = a[i];
        for(int i = 0; i < d;i++)
            b[i + n - d] = a[i];
        return b;
    }

    static void Main(string[] args) {
        string[] tokens_n = Console.ReadLine().Split(' ');
        int n = Convert.ToInt32(tokens_n[0]);
        int k = Convert.ToInt32(tokens_n[1]);
        string[] a_temp = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(a_temp,Int32.Parse);
        
        int[] b = rotLeft(a, k);
        
        foreach(int ch in b)
            Console.Write("{0} ",ch);
    }
        
}
