using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Solution {
class Solution {
    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] p_inverse = new int[n+1];
        String[] p_temp = Console.ReadLine().Split(' ');
        int[] p = Array.ConvertAll(p_temp, Int32.Parse);
        for(int i = 1; i <= n; i++){
            p_inverse[p[i-1]] = i;
        }
        for(int i = 1; i <= n;i++){
            Console.WriteLine(p_inverse[p_inverse[i]]);
        }
        
    }
}
}
