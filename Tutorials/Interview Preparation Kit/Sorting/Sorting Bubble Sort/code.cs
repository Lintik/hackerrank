using System.IO;
using System.Linq;
using System.Text;
using System;

class Solution {

    static void countSwaps(int[] a) {
        int count = 0;
        for (int i = 0; i < a.Length; i++) {
            for (int j = 0; j < a.Length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    count++;
                }
            }
        }
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);
        textWriter.WriteLine("Array is sorted in {0} swaps.", count);
        textWriter.WriteLine("First Element: {0}", a[0]);
        textWriter.WriteLine("Last Element: {0}", a[a.Length - 1]);

        textWriter.Flush();
        textWriter.Close();

    }

    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());

        int[] a = new int[n];
        string[] b = (Console.ReadLine()).Split(' ');
        for(int i = 0;i < n;i++) a[i] = Convert.ToInt32(b[i]); 
        countSwaps(a);

    }
}
