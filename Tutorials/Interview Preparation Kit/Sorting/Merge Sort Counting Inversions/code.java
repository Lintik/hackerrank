import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static long countInversions(int[] arr){
        
        return mergeSort(arr, 0, arr.length - 1);
    }
    
    public static long mergeSort(int[] arr, int start, int end){
        if(start == end)
            return 0;
        int mid = (start + end) / 2;
        long count = 0;
        count += mergeSort(arr, start, mid); //left inversions
        count += mergeSort(arr, mid + 1, end);//right inversions
        count += merge(arr, start, end); // split inversions.
        return count;
    }
    
    public static long merge(int[] arr, int start, int end){
        int mid = (start + end) / 2;
        int[] newArr = new int[end - start + 1];
        int curr = 0;
        int i = start;
        int j = mid + 1;
        long count = 0;
        while(i <= mid && j <=end) {
            if(arr[i] > arr[j]) {
                newArr[curr++] = arr[j++];
                count += mid - i + 1; // Tricky part.
            }
            else
                newArr[curr++] = arr[i++];          
        }
         // Leftover elements here.
        while(i <= mid) {
            newArr[curr++] = arr[i++];    
        }
        
        while(j <= end) {
            newArr[curr++] = arr[j++];
        }
     
        System.arraycopy(newArr, 0, arr, start, end - start + 1); // Usual stuff from merge sort algorithm with arrays.
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
