import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int c = 0;
        for(int i = m; i <= n;i++){
            int r = 0;
            int temp = i;
            while(temp > 0){
                r *= 10;
                r += temp % 10;
                temp /= 10;
            }
            if(Math.abs(i - r) % k == 0) c++;
        }
        System.out.println(c);
    }
}
