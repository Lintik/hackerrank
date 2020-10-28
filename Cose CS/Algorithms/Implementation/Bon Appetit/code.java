import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int sum = 0;
        int t = ar[k];
        ar[k] = 0;
        for(int i=0;i<n;i++){
            sum+=ar[i];
        }
        if(b - sum/2 == 0){
            System.out.println("Bon Appetit");
            return 0;
        }
        else return b - sum/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result>0)
            System.out.println(result);
    }
}
