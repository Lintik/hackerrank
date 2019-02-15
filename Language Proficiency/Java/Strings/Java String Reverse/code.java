import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length();
        for(int i=0;i<l;i++){
            if(A.charAt(i) != A.charAt(l-1-i)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
}
