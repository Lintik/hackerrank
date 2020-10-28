import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int minAbsoluteDifference(int[] a){
        Arrays.sort(a);
        if(a.length == 1){
            return 1;
        }
        int m = 0; 
        int c1 = 1,
            c2 = 0;
        int prev = a[0];
        for(int i = 1; i < a.length;i++){
            if(a[i] == prev)
                c1++;
            else if (a[i] == prev + 1)
                c2++;
            else{
                if(m < c1 + c2)
                    m = c1 + c2;
                if(a[i] - 1 == prev + 1){
                    c1 = c2;
                    c2 = 1;
                    prev = a[i] - 1;
                } 
                else{
                    prev = a[i];
                    c1 = 1;
                    c2 = 0;
                }
            }
        }
        if(m < c1 + c2)
            m = c1 + c2;
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(minAbsoluteDifference(a));
    }
}
