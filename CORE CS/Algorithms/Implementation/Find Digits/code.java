import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++){
            int n = sc.nextInt();
            int r = n;
            int count = 0;
            while(r > 0){
                if(r % 10 != 0 && n % (r % 10) == 0) count++;
                r /= 10;
            }
            System.out.println(count);
        }
    }
}
