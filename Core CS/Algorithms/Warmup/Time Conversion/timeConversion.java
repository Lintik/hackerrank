import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {

    static String timeConversion(String s) {
        if(s.charAt(8) =='A')
            if(s.charAt(0) == '1' && s.charAt(1) == '2')
                return "00" + s.substring(2,8);
            else
                return s.substring(0,8);
        else{
            if(s.charAt(0) == '1' && s.charAt(1) == '2')
                return s.substring(0,8);
            else
                return String.valueOf(Integer.parseInt(s.substring(0,2)) + 12) + s.substring(2,8);
                
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
