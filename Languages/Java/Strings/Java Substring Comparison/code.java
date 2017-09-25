import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0, k);
        largest = smallest;
        for(int i = 1;i+k<=s.length();i++){
            String t1 = s.substring(i,k+i);
            if(t1.compareTo(smallest) <= 0)
                smallest = t1;
            if(t1.compareTo(largest) > 0)
                largest = t1;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
