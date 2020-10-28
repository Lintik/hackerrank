import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++){
            int n = sc.nextInt();
            int m = ~(~1<<(n>>1)) << n%2;
            System.out.println(m);
        }
    }
}
