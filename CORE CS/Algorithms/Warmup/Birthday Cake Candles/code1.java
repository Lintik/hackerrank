import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // the number of candles
        int n = scan.nextInt();
        
        // store the current maximum height of any candle, initialize to the minimum possible height of any candle
        int maxHeight = 1; 
        
        // count the number of candles having the maximum height
        int countMax = 0;
        
        for(int i = 0; i < n; i++) {
            int tmp = scan.nextInt();
            
            // if you read in a value larger than maxHeight, set new maxHeight
            if(tmp > maxHeight) {
                maxHeight = tmp;
                countMax = 1;
            }
            // if you read a value equal to the current value of maxHeight
            else if(tmp == maxHeight) {
            	// increment the count of candles having maximum height
                countMax++;
            }
        }
        scan.close();
        
        System.out.println(countMax);
    }
}
