import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(keyboards[i]+drives[j]<=s){
                  if(max<keyboards[i]+drives[j]){
                      max=keyboards[i]+drives[j];
                  }  
                }
            }
        }
        System.out.println(max==0?-1:max);
        
    }
}
