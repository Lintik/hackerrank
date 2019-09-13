using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string[] h_temp = Console.ReadLine().Split(' ');
        int[] h = Array.ConvertAll(h_temp,Int32.Parse);
        string word = Console.ReadLine();
        int m = 0;
        for(int i = 0; i < word.Length;i++){
            if(h[word[i] - 'a'] > m)
                m = h[word[i] - 'a'];
        }
        Console.WriteLine(m * word.Length);
    }
}
