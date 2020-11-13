import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] r = new int[5];
    
        for(int a: ar)
            r[a-1]++;
            
        int mx = 0;
        int mx_i = 0;
        for(int i = 0;i < 5;i++){
            if(r[i] > mx){
                mx = r[i];
                mx_i = i;
            }
        }
        return mx_i + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
