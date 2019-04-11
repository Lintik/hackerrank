using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(string s) {
        int count = 0;
        Dictionary<string, int> subs = new Dictionary<string, int>();
        int l = s.Length;
        for(int i = l - 1;i > 0;i--){
            for(int j = 0; j + i <= l;j++){
                string t = s.Substring(j, i);
                char[] characters = t.ToArray();
                Array.Sort(characters);
                t = new string(characters);

                if(!subs.ContainsKey(t)){
                    subs.Add(t, 1);
                }
                else
                    subs[t] += 1;
            }
        }
            
        
        foreach (KeyValuePair<string, int> s1 in subs) {
            if(s1.Value > 1){
                count += (s1.Value - 1) * (s1.Value) / 2;
            }
        }
        return count;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int q = Convert.ToInt32(Console.ReadLine());

        for (int qItr = 0; qItr < q; qItr++) {
            string s = Console.ReadLine();

            int result = sherlockAndAnagrams(s);

            textWriter.WriteLine(result);
        }

        textWriter.Flush();
        textWriter.Close();
    }
}
