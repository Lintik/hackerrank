import java.io._
import java.text._

object Solution extends App {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        var alice = 0;
        var bob = 0;
        if (a0 > b0) alice += 1 else if (b0 > a0) bob += 1 else alice = alice
        if (a1 > b1) alice += 1 else if (b1 > a1) bob += 1 else alice = alice
        if (a2 > b2) alice += 1 else if (b2 > a2) bob += 1 else alice = alice
        println (alice + " " + bob)
    }
}