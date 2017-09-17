using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
        Array.Sort(arr);
        long mx = 0;
        long mn = 0;
        for(int i = 0;i<5;i++){
            if(i > 0) mx+=arr[i];
            if(i < 4) mn+=arr[i];
        }
        Console.Write(mn);
        Console.Write(' ');
        Console.Write(mx);
    }
}
