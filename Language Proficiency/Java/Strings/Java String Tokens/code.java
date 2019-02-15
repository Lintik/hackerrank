import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.length() == 0){
            System.out.println("0");
            return;
        }
        String[] ss=s.split("[ !,?._'@]+");
        System.out.println(ss.length);
        for(int i = 0;i<ss.length;i++)
            System.out.println(ss[i]);
        scan.close();
    }
}
