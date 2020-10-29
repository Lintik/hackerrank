using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
        float a = 0, b = 0, c = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>0) a++;
            else if(arr[i]<0) b++;
            else c++;
        }
        Console.WriteLine(a/n);
        Console.WriteLine(b/n);
        Console.WriteLine(c/n);
    }
}
