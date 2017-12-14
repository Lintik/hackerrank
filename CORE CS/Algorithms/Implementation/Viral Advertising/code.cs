using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] m = new int[n+1];
        m[0] = 2;
        for(int i = 0; i < n - 1;i++)
            m[i+1] = 3*m[i]/2;
        
        Console.WriteLine(m.Sum());
    }
}
