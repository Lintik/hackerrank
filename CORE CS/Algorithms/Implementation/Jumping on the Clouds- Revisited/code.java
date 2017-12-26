import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int i = 0, E = 100, p = 0; E >= 0;i++){
            E--;
            p += k % n;
            p = p % n;
            if(c[p] == 1) E -= 2;
            if(p == 0){
                System.out.println(E);
                break;
            }
        }
    }
}
