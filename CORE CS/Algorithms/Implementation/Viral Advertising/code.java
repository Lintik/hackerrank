import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n+1];
        m[0] = 2;
        for(int i = 0; i < n - 1;i++)
            m[i+1] = 3*m[i]/2;
        System.out.println(Arrays.stream(m).sum());
        in.close();
    }
}
