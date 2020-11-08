import java.io.*;
import java.text.*;
import java.util.*;

class Result {
    public static int gcd(int a, int b){
        if (b == 0) 
            return a; 
        return gcd(b, a % b); 
    }

    public static int gcd(int[] a){
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans = gcd(ans, a[i]);
        }
        return ans;
    }

    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

    public static int lcm(int[] a){
        int ans = a[0]; 
    
        for (int i = 1; i < a.length; i++) 
            ans = (((a[i] * ans)) / 
                    (gcd(a[i], ans))); 
    
        return ans; 
    }

    public static int getTotalX(int[] a, int[] b) {
        int l = lcm(a);
        int g = gcd(b);
        
        int count = 0;
        for(int i = l, j =2; i<=g; i=l*j,j++){
            if(g%i==0)
                count++;
        }
        return count;
    }

}

public class Solution {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        
        for(int i = 0;i < m;i++)
            a[i] = in.nextInt();
            
         for(int i = 0;i < n;i++)
            b[i] = in.nextInt();
        
        System.out.println(Result.getTotalX(a, b)); 
    }
}
