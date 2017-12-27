using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            int n = Convert.ToInt32(Console.ReadLine());
            int r = n;
            int count = 0;
            while(r > 0){
                if(r % 10 != 0 && n % (r % 10) == 0) count++;
                r /= 10;
            }
            Console.WriteLine(count);
        }
    }
}
