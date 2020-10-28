using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string[] tokens_n = Console.ReadLine().Split(' ');
        int n = Convert.ToInt32(tokens_n[0]);
        int k = Convert.ToInt32(tokens_n[1]);
        string[] c_temp = Console.ReadLine().Split(' ');
        int[] c = Array.ConvertAll(c_temp,Int32.Parse);
        
        for(int i = 0, E = 100, p = 0; E >= 0;i++){
            E--;
            p += k % n;
            p = p % n;
            if(c[p] == 1) E -= 2;
            if(p == 0){
                Console.WriteLine(E);
                break;
            }
        }
    }
}
