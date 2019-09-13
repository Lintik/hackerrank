import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nInputs = sc.nextDouble();
        
        int nP = 0;
        int nN = 0;
        int nZ = 0;
        for(int i = 0; i < nInputs;i++){
            int t = sc.nextInt();
            if(t > 0) nP++;
            else if(t < 0) nN++;
            else nZ++;
        }
        sc.close();
        System.out.println(nP/nInputs);
        System.out.println(nN/nInputs);
        System.out.println(nZ/nInputs);
    }
}
