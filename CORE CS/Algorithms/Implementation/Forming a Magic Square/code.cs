using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static int evaluate(int[] a){
        int m = Int32.MaxValue;
        int[][] b = new int[][]{
            new int[]{8,1,6,3,5,7,4,9,2}, 
            new int[]{4,3,8,9,5,1,2,7,6}, 
            new int[]{2,9,4,7,5,3,6,1,8},
            new int[]{6,7,2,1,5,9,8,3,4},
            new int[]{6,1,8,7,5,3,2,9,4},
            new int[]{8,3,4,1,5,9,6,7,2},
            new int[]{4,9,2,3,5,7,8,1,6},
            new int[]{2,7,6,9,5,1,4,3,8}};
        for(int i = 0;i < 8;i++){
            int diff = 0;
            for(int j = 0;j < 9;j++) 
                diff += Math.Abs(a[j]-b[i][j]);
            if (diff < m) 
                m = diff;
        }
        return m;
    }
    
    static void Main(String[] args) {
        int[] s = new int[9];
        string[] a= Console.ReadLine().Split(' ');
        string[] b= Console.ReadLine().Split(' ');
        string[] c= Console.ReadLine().Split(' ');
        for(int i = 0; i < 3;i++){
            s[i] = Convert.ToInt32(a[i]);
        }
        for(int i = 3,j = 0; i < 6;i++, j++){
            s[i] = Convert.ToInt32(b[j]);
        }
        for(int i = 6, j = 0; i < 9;i++, j++){
            s[i] = Convert.ToInt32(c[j]);
        }
        Console.WriteLine(evaluate(s));
    }
}
