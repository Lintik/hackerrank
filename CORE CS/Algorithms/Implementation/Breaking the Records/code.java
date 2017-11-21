import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int maxc = 0,
            minc = 0,
            max = s[0],
            min = s[0];
        
        for(int i=1;i<s.length;i++){
            if(max < s[i]){
                max = s[i];
                maxc++;
            }
            else if(min > s[i]){
                min = s[i];
                minc++;
            }
        }
        return new int[]{maxc,minc};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
