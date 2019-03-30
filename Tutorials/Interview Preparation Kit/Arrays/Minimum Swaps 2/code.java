import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int c = 0; 
        int[] index = new int[arr.length];
        
        for(int i = 0; i < arr.length;i++){//create a dictionary that returns the index
            index[arr[i] - 1] = i;  
        }

        for(int i = 0; i < arr.length - 1;i++){
            if(arr[i] != i + 1){
                c++;

                //swap arr
                int t_arr = arr[i];
                arr[i] = i + 1;
                arr[index[i]] = t_arr;

                //swap index
                int t = index[i]; 
                index[i] = i;
                index[t_arr - 1] = t;
            }
        }

        return c;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
