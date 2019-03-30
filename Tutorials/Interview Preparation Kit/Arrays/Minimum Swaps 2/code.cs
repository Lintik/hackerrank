using System.IO;
using System.Linq;
using System;

class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int c = 0; 
        int[] index = new int[arr.Length];
        
        for(int i = 0; i < arr.Length;i++){//create a dictionary that returns the index
            index[arr[i] - 1] = i;  
        }

        for(int i = 0; i < arr.Length - 1;i++){
            if(arr[i] != i + 1){
                c++;

                //swap arr
                int t_arr = arr[i];
                arr[i] = i + 1;
                arr[index[i]] = t_arr;

                //swap index
                int t = index[i]; 
                index[i] = i;
                index[t_arr - 1] = t;
            }
        }

        return c;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
        ;
        int res = minimumSwaps(arr);

        textWriter.WriteLine(res);

        textWriter.Flush();
        textWriter.Close();
    }
}
