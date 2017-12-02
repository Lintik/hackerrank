import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {
    static int solve(int n, String ar){
          int depth = 0;
        int t = 0;
        for(int i = 0; i < n;i++){
            if(depth < 0){
                depth = ar.charAt(i) == 'U'? depth + 1:depth - 1;
                if(depth == 0) t++;
            }
            else
                depth = ar.charAt(i) == 'U'? depth + 1:depth - 1;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ar = sc.next();
        int result = solve(n, ar);
        System.out.println(result);
    }
}
