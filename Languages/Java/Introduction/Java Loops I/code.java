import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1;i<11;i++){
            String t = String.format("%s x %s = %s",String.valueOf(N), String.valueOf(i), String.valueOf(N*i));
            System.out.println(t);
        }
    }
}
