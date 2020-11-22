using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    static int sockMerchant(int n, int[] ar) {
        return ar.GroupBy(x => x).ToDictionary(x => x.Key, x => x.Count()).Values.Aggregate(0, (acc, x) => acc + x/2);
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp))
        ;
        int result = sockMerchant(n, ar);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
