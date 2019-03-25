using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int t = 0;
        int[] r = new int[q.Length];
        for(int i = 0; i < q.Length;i++){
            r[q[i] - 1] = q[i] - (i + 1);
            if(r[i] > 2){
                Console.WriteLine("Too chaotic");
                return;
            }

            for (int j = Math.Max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) t++;
            
        }
        Console.WriteLine(t);
    }

    static void Main(string[] args) {
        int t = Convert.ToInt32(Console.ReadLine());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Convert.ToInt32(Console.ReadLine());

            int[] q = Array.ConvertAll(Console.ReadLine().Split(' '), qTemp => Convert.ToInt32(qTemp))
            ;
            minimumBribes(q);
        }
    }
}