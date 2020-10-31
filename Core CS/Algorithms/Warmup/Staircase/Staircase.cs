using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        for(int i = 0;i<n;i++){
            for(int j = n;j>i+1;j--)
                Console.Write(' ');
            for(int k = i; k>-1;k--)
                Console.Write('#');
            
            Console.WriteLine();
        }
    }
}
