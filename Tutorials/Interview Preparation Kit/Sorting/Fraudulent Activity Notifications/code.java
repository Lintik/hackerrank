import java.io.*;
import java.util.*;

public class Solution {
    static float median(int count[], int d){
        int d2 = (d+1)/2;
        for (int i = 0; i < count.length; i++){
            if (count[i] > d2) return i;
            if (count[i] == d2){
                if (d%2 != 0) return i;
                for (int j = i + 1; j < count.length; j++)
                    if (count[j] > 0) return (i+j)/2.0f;
            }
            d2 -= count[i];
        }
        return 0;
    }
    static int activityNotifications(int[] a,int n, int d) {
        int result = 0;
        int[] count = new int[201];

        for (int i = 0; i < n; i++){
            int v = a[i];
            if (i >= d){
                float m = median(count, d);
                if (v >= 2*m)
                    result++;
                count[a[i - d]]--;
            }
            count[v]++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = scanner.nextInt();

        System.out.println(activityNotifications(a, n, d));

    }
}
