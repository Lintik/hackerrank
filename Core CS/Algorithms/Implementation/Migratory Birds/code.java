import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
    
        int previous = ar[0];
        int popular = ar[0];
        int count = 1;
        int maxCount = 1;
        
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    popular = ar[i-1];
                    maxCount = count;
                }
                previous = ar[i];
                count = 1;
            }
        }

        return count > maxCount ? ar[ar.length-1] : popular;
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
