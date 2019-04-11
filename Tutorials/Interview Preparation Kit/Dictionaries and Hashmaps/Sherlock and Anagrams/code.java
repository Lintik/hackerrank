import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count = 0;
        HashMap<String, Integer> subs = new HashMap<String, Integer>();
        int l = s.length();
        for(int i = l - 1;i > 0;i--){
            for(int j = 0; j + i <= l;j++){
                String t = s.substring(j, j + i);
                char characters[] = t.toCharArray(); 
                Arrays.sort(characters);
                t = new String(characters);

                if(!subs.containsKey(t)){
                    subs.put(t, 1);
                }
                else{
                    int n = subs.get(t) + 1;
                    subs.put(t, n);
                }
            }
        }
            
        
        for (Integer value : subs.values()) {
            if(value > 1){
                count += (value - 1) * (value) / 2;
            }
        }
        return count;
    }   

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
