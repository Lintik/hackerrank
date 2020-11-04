import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple = 0;
        int orange = 0;
        for(int apple_i = 0;apple_i < m;apple_i++){
            int c = in.nextInt();
            c+=a;
            if(c >= s && c <= t) apple++;
        }
        for(int orange_i = 0;orange_i < n;orange_i++){
            int c = in.nextInt();
            c+=b;
            if(c >= s && c <= t) orange++;
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
