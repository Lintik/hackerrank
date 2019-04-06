import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        for(String word: magazine){
            if(!(words.containsKey(word))){
                words.put(word, 1);
            }
            else{
                int t = words.get(word) + 1;
                words.put(word, t);
            }
        }
        for(String word: note){
            if(words.containsKey(word)){
                int t = words.get(word) - 1;
                if(t < 0){
                    System.out.println("No");
                    return;
                }
                words.put(word, t);
            }
            else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];
        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];
        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
