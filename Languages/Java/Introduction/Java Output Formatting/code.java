import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                System.out.print(String.format("%-15s", s1 ));
                System.out.println(String.format("%-15s", String.format("%3s", x).replace(' ', '0')));
            }
            System.out.println("================================");

    }
}
