import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0;i < n;i++)
            A[i] = sc.nextInt();
        for(int i = n - 1;i >= 0;i--){
            System.out.print(A[i]);
            System.out.print(' ');
        }
    }
}
