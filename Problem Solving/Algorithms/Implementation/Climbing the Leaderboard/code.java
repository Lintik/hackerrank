import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] duplicates(int[] a){
        Set<Integer> s = new HashSet<Integer>();
        for(int num: a){
            s.add(num);
        }
        Integer[] arr = s.toArray(new Integer[s.size()]);
        Arrays.sort(arr, Collections.reverseOrder());
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
    public static int[] findRank(int[] scores, int n, int[] a, int m){
        scores = duplicates(scores);
        int j = scores.length - 1;
        for(int i = 0; i < a.length;i++){
            while(j>=0){
                if(a[i] < scores[j]){
                    a[i] = j + 2;
                    break;
                }
                else if(a[i] == scores[j]){
                    a[i] = j + 1;
                    break;
                }
                else if(a[i] >= scores[0]){
                    a[i] = 1;
                    break;
                }
                j--;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] a = findRank(scores, n, alice, m);
        for(int num: a)
            System.out.println(num);
        in.close();
    }
}
