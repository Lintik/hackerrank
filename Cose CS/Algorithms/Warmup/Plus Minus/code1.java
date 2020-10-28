import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numInputs = scan.nextDouble();
        int posInputs = 0;
        int negInputs = 0;
        int zeroInputs = 0;

        for(int i = 0; i < numInputs; i++){
            int tmp = scan.nextInt();
            
            if (tmp > 0){
                posInputs++;
            }
            else if(tmp < 0){
                negInputs++;
            }
            else{
                zeroInputs++;
            }
        }
        scan.close();
        
        // Print result:
        System.out.println(posInputs / numInputs);
        System.out.println(negInputs / numInputs);
        System.out.println(zeroInputs / numInputs);
    }
}
