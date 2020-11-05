import java.io._
import java.text._
import java.util._

object Solution {

    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
        println(apples.filter(apple => (apple + a) >= s && (apple + a) <= t).size)
        println(oranges.filter(orange => orange + b >= s && orange + b <= t).size)

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn
        val st = stdin.readLine.split(" ")
        val s = st(0).trim.toInt
        val t = st(1).trim.toInt
        val ab = stdin.readLine.split(" ")
        val a = ab(0).trim.toInt
        val b = ab(1).trim.toInt
        val mn = stdin.readLine.split(" ")
        val m = mn(0).trim.toInt
        val n = mn(1).trim.toInt
        
        val apples = stdin.readLine.split(" ").map(_.trim.toInt)
        val oranges = stdin.readLine.split(" ").map(_.trim.toInt)
        countApplesAndOranges(s, t, a, b, apples, oranges)
    }
}
