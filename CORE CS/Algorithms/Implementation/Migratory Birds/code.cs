using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Array.Sort(ar);
    
        int previous = ar[0];
        int popular = ar[0];
        int count = 1;
        int maxCount = 1;
        
        for (int i = 1; i < ar.Length; i++) {
            if (ar[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    popular = ar[i-1];
                    maxCount = count;
                }
                previous = ar[i];
                count = 1;
            }
        }

        return count > maxCount ? ar[ar.Length-1] : popular;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] ar_temp = Console.ReadLine().Split(' ');
        int[] ar = Array.ConvertAll(ar_temp,Int32.Parse);
        int result = migratoryBirds(n, ar);
        Console.WriteLine(result);
    }
}
