import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N, K;
        N = scan.nextInt();
        K = scan.nextInt();

        int[] a = new int[N + 1];
        int p, q, sum;
        long max = 0, x = 0;
        for(int i = 0;i < K;i++){
            p = scan.nextInt();
            q = scan.nextInt();
            sum = scan.nextInt();
            a[p] += sum;
            if ((q + 1) <= N)
                a[q + 1] -= sum;
        }

        for (int i = 1; i <= N; i++) {
            x = x + a[i];
            if (max < x)
                max = x;
        }
        System.out.println(max);
    }
}
