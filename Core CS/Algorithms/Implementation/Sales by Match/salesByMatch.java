import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
         Hashtable<Integer, Integer> m = new Hashtable<Integer, Integer>();
         int r = 0;

         for(int a: ar){
             if(m.containsKey(a))
                m.put(a, m.get(a) + 1);
            else
                m.put(a, 1);
         }

         for(int a: m.values())
            r += a/2;

        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
