import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int evaluate(int[] a){
        int m = Integer.MAX_VALUE;
        int[][] b = new int[][]{
            new int[]{8,1,6,3,5,7,4,9,2}, 
            new int[]{4,3,8,9,5,1,2,7,6}, 
            new int[]{2,9,4,7,5,3,6,1,8},
            new int[]{6,7,2,1,5,9,8,3,4},
            new int[]{6,1,8,7,5,3,2,9,4},
            new int[]{8,3,4,1,5,9,6,7,2},
            new int[]{4,9,2,3,5,7,8,1,6},
            new int[]{2,7,6,9,5,1,4,3,8}};
        for(int i = 0;i < 8;i++){
            int diff = 0;
            for(int j = 0;j < 9;j++) 
                diff += Math.abs(a[j]-b[i][j]);
            if (diff < m) 
                m = diff;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] s = new int[9];
        for(int s_i=0; s_i < 9; s_i++){
            s[s_i] = in.nextInt();
        }
        System.out.println(evaluate(s));
        in.close();
    }
}
