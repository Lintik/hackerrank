using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<long> arr, long r) {
        Dictionary<long, long> potential = new Dictionary<long, long>();
        Dictionary<long, long> counter = new Dictionary<long, long>();
        long count = 0;
        foreach(long i in arr){
            long key = i / r;

            if(counter.ContainsKey(key) && i % r == 0)
                count += counter[key];

            if(potential.ContainsKey(key) && i % r == 0){
                long c = potential[key];
                long d = counter.ContainsKey(i)? counter[i] + c: c;
                counter[i] =  d;
            } 

            long e = potential.ContainsKey(i)? potential[i] + 1: 1;
            potential[i] = e;
        }
        return count;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string[] nr = Console.ReadLine().TrimEnd().Split(' ');

        int n = Convert.ToInt32(nr[0]);

        long r = Convert.ToInt64(nr[1]);

        List<long> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt64(arrTemp)).ToList();

        long ans = countTriplets(arr, r);

        textWriter.WriteLine(ans);

        textWriter.Flush();
        textWriter.Close();
    }
}
