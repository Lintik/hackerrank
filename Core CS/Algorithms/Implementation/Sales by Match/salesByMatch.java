import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int t=0;
        int c=1;
        int prev = ar[0];
        for(int i = 1;i<n;i++){
            if(prev == ar[i])
               c++;
            else{
                t+=c/2;
                c=1;
                prev=ar[i];
            }
        }   
        t+=c/2;
        return t;
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
