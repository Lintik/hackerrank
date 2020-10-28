import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][];
        for(int i = 0;i < 6;i++){
            arr[i] = new int[6];
            for(int j = 0;j < 6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] n = new int[16];
        int k = 0;
        for(int i = 0;i < 4;i++)
            for(int j = 0;j < 4;j++){
                n[k++] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                     + arr[i+1][j+1]
                     + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            }
        int m = -1000;
        for(int i = 0;i < 16;i++){
            m = m < n[i]? n[i]:m;
        }
        System.out.println(m);
    }
}
