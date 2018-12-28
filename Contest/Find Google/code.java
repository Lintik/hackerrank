import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        // Create your code here
        Pattern p = Pattern.compile("^(g|G)(o|O|0|(\\<\\>)|(\\(\\))|(\\<\\>)|(\\[\\]))(o|O|0|(\\<\\>)|(\\(\\))|(\\<\\>)|(\\[\\]))(g|G)(l|L|I)(e|E|3)$");
        Matcher m = p.matcher(s);  
        boolean b = m.matches();
        System.out.println(b ? "True":"False");
        bufferedReader.close();
    }
}