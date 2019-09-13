using System.IO;
using System.Collections;
using System.Linq;
using System;

class Solution {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        return mergeSort(arr)
    }

    static long mergeSort(int[] arr){

    }

    static long merge(int[] arr, int count){
        
    }

    static void Main(string[] args) {
        int d = Convert.ToInt32(Console.Readline());
        for(int i = 0;i<d;i++){
            int n = Convert.ToInt32(Console.Readline());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            Console.WriteLint(countInversions(arr));
        }
    }
}