import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    static String numberLineJumps(int x1, int v1, int x2, int v2) {
        if(v2 >= v1) return "NO";
        return (x2-x1)%(v1-v2) == 0? "YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = numberLineJumps(x1, v1, x2, v2);
        System.out.println(result);
    }
}
