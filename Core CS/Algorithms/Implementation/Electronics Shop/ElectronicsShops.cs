using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        Array.Sort(keyboards, (x,y) => y.CompareTo(x));
        Array.Sort(drives, (x,y) => y.CompareTo(x));
    
        int k = keyboards.Length;
        int d = drives.Length; 
        int max = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < d;j++){
                int t = keyboards[i] + drives[j];
                if(t == s)
                    return s;
                else if(t < s){
                    if(max < t) max = t;
                    break;
                }
                else continue;
            }
        }
        if(max == 0) return -1;
        else return max;
    }

    static void Main(String[] args) {
        string[] tokens_s = Console.ReadLine().Split(' ');
        int s = Convert.ToInt32(tokens_s[0]);
        int n = Convert.ToInt32(tokens_s[1]);
        int m = Convert.ToInt32(tokens_s[2]);
        string[] keyboards_temp = Console.ReadLine().Split(' ');
        int[] keyboards = Array.ConvertAll(keyboards_temp,Int32.Parse);
        string[] drives_temp = Console.ReadLine().Split(' ');
        int[] drives = Array.ConvertAll(drives_temp,Int32.Parse);
       
        int moneySpent = getMoneySpent(keyboards, drives, s);
        Console.WriteLine(moneySpent);
    }
}
