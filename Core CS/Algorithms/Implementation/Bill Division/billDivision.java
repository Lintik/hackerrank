import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    static void bonAppetit(int k, int b, int[] ar) {
        int s = 0 - ar[k];
        for(int a: ar)
            s += a;
        
        if(b - s/2 == 0)
            System.out.println("Bon Appetit");
        else
             System.out.println(b - s/2);
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
        bonAppetit(k, b, ar);
    }
}
