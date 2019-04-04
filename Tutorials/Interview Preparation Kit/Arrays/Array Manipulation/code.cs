using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    static void Main(string[] args) {
       
        long N, K, p, q, sum, j, max = 0, x = 0;
        string[] u = Console.ReadLine().Split(' ');
        N = Convert.ToInt64(u[0]);
        K = Convert.ToInt64(u[1]);

        int[] b = new int[N + 1];
        long[] a = b.Select(i => (long)i).ToArray();

        for (long i = 0; i < K; i++) {
            string[] v = Console.ReadLine().Split(' ');
            p = Convert.ToInt64(v[0]);
            q = Convert.ToInt64(v[1]);
            sum = Convert.ToInt64(v[2]);
            a[p] += sum;
            if ((q + 1) <= N)
                a[q + 1] -= sum;
        }

        for (long i = 1; i <= N; i++) {
            x = x + a[i];
            if (max < x)
                max = x;
        }
        Console.WriteLine(max);
        
    }

}
