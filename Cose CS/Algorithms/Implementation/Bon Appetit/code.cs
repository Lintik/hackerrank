using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int sum = 0;
        int t = ar[k];
        ar[k] = 0;
        for(int i=0;i<n;i++){
            sum+=ar[i];
        }
        if(b - sum/2 == 0){
            Console.WriteLine("Bon Appetit");
            return 0;
        }
        else return b - sum/2;
    }

    static void Main(String[] args) {
        string[] tokens_n = Console.ReadLine().Split(' ');
        int n = Convert.ToInt32(tokens_n[0]);
        int k = Convert.ToInt32(tokens_n[1]);
        string[] ar_temp = Console.ReadLine().Split(' ');
        int[] ar = Array.ConvertAll(ar_temp,Int32.Parse);
        int b = Convert.ToInt32(Console.ReadLine());
        int result = bonAppetit(n, k, b, ar);
        if(result >0)
            Console.WriteLine(result);
    }
}
