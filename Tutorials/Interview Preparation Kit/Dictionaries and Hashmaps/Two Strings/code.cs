using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System;

class Solution {

    // Complete the twoStrings function below.
    static string twoStrings(string s1, string s2) {
        HashSet<char> s = new HashSet<char>();
        foreach(char c in s1)
            s.Add(c);
        foreach(char c in s2){
            if(s.Contains(c))
                return "YES";
        }
        return "NO";
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int q = Convert.ToInt32(Console.ReadLine());

        for (int qItr = 0; qItr < q; qItr++) {
            string s1 = Console.ReadLine();

            string s2 = Console.ReadLine();

            string result = twoStrings(s1, s2);

            textWriter.WriteLine(result);
        }

        textWriter.Flush();
        textWriter.Close();
    }
}
