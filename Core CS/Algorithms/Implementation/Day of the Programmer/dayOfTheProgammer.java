import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String dayOfTheProgrammer(int year){
        int mon7 = 215;
        int feb; //days in february
        if(year < 1918) //julian
            feb = year%4>0 ? 28 : 29;
        else if(year > 1918) //gregorian
            feb = !(year%400 >0) || year%100>0 && !(year%4>0) ? 29 : 28;
        else // 1918
            feb = 15;
        feb = 256 - (feb + mon7);
        return Integer.toString(feb) + ".09." + Integer.toString(year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = dayOfTheProgrammer(year);
        System.out.println(result);
    }
}
