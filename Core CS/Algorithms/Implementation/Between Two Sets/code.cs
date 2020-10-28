using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int getTotalX(int[] a, int[] b) {
        int m = a.Last();
        int c = 0;
        for(int i = 0; i < a.Length - 1;i++){
            if(m % a[i] != 0){
                for(int j = 2; j <= a[i];j++){
                    if(m*j > b.First()){
                        return 0;
                    }
                    else if((m*j) % a[i] == 0){
                        m *= j;
                        break;
                    }
                    else continue;
                }
            }
        }
        
        for(int j = 0; j < b.Length; j++)
            if(b[j]%m != 0) return 0;
            
        c = 1;
        for(int i = 2; m * i <= b.First();i++){
            if(b.Where(x => x % (m*i) != 0).Count() == 0)
                c++;
        }
        return c;
        
    }

    static void Main(String[] args) {
        string[] tokens_n = Console.ReadLine().Split(' ');
        int n = Convert.ToInt32(tokens_n[0]);
        int m = Convert.ToInt32(tokens_n[1]);
        string[] a_temp = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(a_temp,Int32.Parse);
        string[] b_temp = Console.ReadLine().Split(' ');
        int[] b = Array.ConvertAll(b_temp,Int32.Parse);
        int total = getTotalX(a, b);
        Console.WriteLine(total);
    }
}
