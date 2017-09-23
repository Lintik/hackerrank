import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for(int i=1;sc.hasNextLine();i++){
            System.out.print(i);
            System.out.print(' ');
            System.out.println(sc.nextLine());
        }
    }
}
