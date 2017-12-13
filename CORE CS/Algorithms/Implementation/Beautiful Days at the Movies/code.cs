using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        string[] a = Console.ReadLine().Split(' ');
        int m = Int32.Parse(a[0]);
        int n = Int32.Parse(a[1]);
        int k = Int32.Parse(a[2]);
        int c = 0;
        for(int i = m; i <= n;i++){
            int r = 0;
            int temp = i;
            while(temp > 0){
                r *= 10;
                r += temp % 10;
                temp /= 10;
            }
            if(Math.Abs(i - r) % k == 0) c++;
        }
        Console.WriteLine(c);
    }
}
