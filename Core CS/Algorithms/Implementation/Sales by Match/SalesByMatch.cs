using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Array.Sort(ar);
        int t=0;
        int c=1;
        int prev = ar[0];
        for(int i = 1;i<n;i++){
            if(prev == ar[i])
               c++;
            else{
                t+=c/2;
                c=1;
                prev=ar[i];
            }
        }   
        t+=c/2;
        return t;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] ar_temp = Console.ReadLine().Split(' ');
        int[] ar = Array.ConvertAll(ar_temp,Int32.Parse);
        int result = sockMerchant(n, ar);
        Console.WriteLine(result);
    }
}
