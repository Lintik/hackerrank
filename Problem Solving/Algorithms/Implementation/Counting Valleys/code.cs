using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static int solve(int n, string ar){
        int depth = 0;
        int t = 0;
        for(int i = 0; i < n;i++){
            if(depth < 0){
                depth = ar[i] == 'U'? depth + 1:depth - 1;
                if(depth == 0) t++;
            }
            else
                depth = ar[i] == 'U'? depth + 1:depth - 1;
        }
        return t;
    }
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string ar = Convert.ToString(Console.ReadLine());
        int result = solve(n, ar);
        Console.WriteLine(result);
    }
}
