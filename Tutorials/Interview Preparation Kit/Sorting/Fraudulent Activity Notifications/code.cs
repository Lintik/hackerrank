using System;
using System.Collections.Generic;
using System.IO;

class Solution {

    static float median(int[] count,int d){
        int d2 = (d+1)/2;
        for (int i = 0; i < count.Length; i++){
            if (count[i] > d2) return i;
            if (count[i] == d2){
                if (d%2 != 0) return i;
                for (int j = i + 1; j < count.Length; j++)
                    if (count[j] > 0) return (i+j)/2.0f;
            }
            d2 -= count[i];
        }
        return 0;
    }

    static int activityNotifications(int[] a, int n,int d) {
        int result = 0;
        int[] count = new int[201];

        for (int i = 0; i < n; i++){
            int v = a[i];
            if (i >= d){
                var m = median(count, d);
                if (v >= 2*m) result++;
                count[a[i - d]]--;
            }
            count[v]++;
        }
        return result;
    }

    static void Main(string[] args) {
        int[] nd = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int n = nd[0];
        int d = nd[1];

        Console.WriteLine(activityNotifications(a,n,d));
    }
}
