import java.io._
import java.text._
import java.util._
import scala.io._

object Solution {

    def bonAppetit(bill: Array[Int], k: Int, b: Int) {
        val s = bill.sum - bill(k)
        
        if(b - s/2 == 0)
            println("Bon Appetit")
 
        else
            println(b - s/2)
    }

    def main(args: Array[String]) {
        val nk = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = nk(0).toInt

        val k = nk(1).toInt

        val bill = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val b = StdIn.readLine.trim.toInt

        bonAppetit(bill, k, b)
    }
}
