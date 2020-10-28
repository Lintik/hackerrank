import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p_inverse = new int[n + 1];
        for(int i = 1; i <= n;i++){
            int px =  sc.nextInt();
            p_inverse[px] = i;
        }
        for(int i = 1; i <= n;i++){
            int y = p_inverse[p_inverse[i]];
            System.out.println(y);
        }
    }
}
