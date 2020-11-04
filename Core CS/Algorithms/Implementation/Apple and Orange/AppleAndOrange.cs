using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int c = 0, d = 0;
        
        foreach(int i in apples)
            if(a+i >= s && a+i <= t) c++;
        foreach(int i in oranges)
            if(b+i >= s && b+i <= t) d++;
        
        Console.WriteLine(c);
        Console.WriteLine(d);
    }

    
    static void Main(String[] args) {
        string[] tokens_s = Console.ReadLine().Split(' ');
        int s = Convert.ToInt32(tokens_s[0]);
        int t = Convert.ToInt32(tokens_s[1]);
        string[] tokens_a = Console.ReadLine().Split(' ');
        int a = Convert.ToInt32(tokens_a[0]);
        int b = Convert.ToInt32(tokens_a[1]);
        string[] tokens_m = Console.ReadLine().Split(' ');
        int m = Convert.ToInt32(tokens_m[0]);
        int n = Convert.ToInt32(tokens_m[1]);
        string[] apple_temp = Console.ReadLine().Split(' ');
        int[] apples = Array.ConvertAll(apple_temp,Int32.Parse);
        string[] orange_temp = Console.ReadLine().Split(' ');
        int[] oranges = Array.ConvertAll(orange_temp,Int32.Parse);
        
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
