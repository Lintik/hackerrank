import java.util.*;

class Solution {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int s = 0;
        for(int i = 0; i<n;i++){
            s += ar[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
        in.close();
    }
}
