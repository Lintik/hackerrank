using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static int[] FindRank(int[] scores, int[] a){
        scores = scores.Distinct().ToArray();
        int j = scores.Length - 1;
        for(int i = 0; i < a.Length;i++){
            while(j>=0){
                if(a[i] < scores[j]){
                    a[i] = j + 2;
                    break;
                }
                else if(a[i] == scores[j]){
                    a[i] = j + 1;
                    break;
                }
                else if(a[i] >= scores[0]){
                    a[i] = 1;
                    break;
                }
                j--;
            }
        }
        return a;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] scores_temp = Console.ReadLine().Split(' ');
        int[] scores = Array.ConvertAll(scores_temp,Int32.Parse);
        int m = Convert.ToInt32(Console.ReadLine());
        string[] alice_temp = Console.ReadLine().Split(' ');
        int[] alice = Array.ConvertAll(alice_temp,Int32.Parse);
        int[] a = FindRank(scores, alice);
        foreach(int i in a)
            Console.WriteLine(i);
    }
}
