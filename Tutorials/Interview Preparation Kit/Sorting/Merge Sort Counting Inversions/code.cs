using System.IO;
using System.Collections;
using System.Linq;
using System;

class Solution {

    static long count = 0;
    static void countInversions(int[] arr) {
        int[] a = mergeSort(arr);
    }

    static int[] mergeSort(int[] arr){
        if(arr.Length == 1) return arr
        int[] l1 = Array.Take(arr.Length/2 +1);
        int[] l2 = Array.Skip(arr.Length/2 +1));
        mergeSort(l1);
        mergeSort(l2));
        merge(l1,l2)
    }

    static int[] merge(int[] l1, int[] l2, int count){
        int[] c = new int[l1.Length +l2.Length ];
        int i, j, k = 0;
        for(;i < l1.Length && j < l2.length;k++){
            if(l1[i] > l2[j]){
                c[k] = l2[j];
                j++;
                count++;
            }
            else{
                c[k] = l1[i];
                i++;
            }
        }
        while(i < l1.Length){
            c[k] = l1[i];
            i++;
            k++;
        }
        while(j < l2.length){
            c[k] = l2[j];
            j++;
            k++;
        }
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