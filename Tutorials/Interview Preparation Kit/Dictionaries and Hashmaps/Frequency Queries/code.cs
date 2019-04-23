using System.Collections.Generic;
using System.Collections;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the freqQuery function below.
    static List<int> freqQuery(List<List<int>> queries) {
        Dictionary<int, int> c = new Dictionary<int , int>();
        Dictionary<int, int> f = new Dictionary<int, int>();
        List<int> r = new List<int>();
        for(int i = 0; i < queries.Count; i++){
            int type = queries[i][0];
            int n = queries[i][1];
            if(type == 1){
                if(c.ContainsKey(n)){//2-nth insertion
                    int m = c[n]++;
                    int m1 = m + 1;

                    if(f.ContainsKey(m1)) f[m1]++;
                    else f[m1] = 1;

                    if(f.ContainsKey(m)){
                        f[m]--;
                        if(f[m] < 1) f.Remove(m);
                    }

                }
                else{//first insertion
                    c[n] = 1;
                    if(f.ContainsKey(1))
                        f[1]++;
                    else
                        f[1] = 1;
                }
            }
            else if(type == 2){
                if(c.ContainsKey(n)){
                    int m = c[n]--;
                    int m1 = m - 1;

                    if(m1 <= 0){
                        c.Remove(n);
                    }
                    if(f.ContainsKey(m)){
                        f[m]--;
                        if(f[m] <= 0) f.Remove(m);
                    }
                    if(f.ContainsKey(m1))
                        f[m1]++;
                    else
                        f[m1] = 1;

                }
                else{//no occurence detected
                    continue;
                }
            }
            else{
                if(f.ContainsKey(n)  && f[n] > 0)
                    r.Add(1);
                else
                    r.Add(0);
            }

        }
        return r;

    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int q = Convert.ToInt32(Console.ReadLine().Trim());

        List<List<int>> queries = new List<List<int>>();

        for (int i = 0; i < q; i++) {
            queries.Add(Console.ReadLine().TrimEnd().Split(' ').ToList().Select(queriesTemp => Convert.ToInt32(queriesTemp)).ToList());
        }

        List<int> ans = freqQuery(queries);

        textWriter.WriteLine(String.Join("\n", ans));

        textWriter.Flush();
        textWriter.Close();
    }
}
