import java.io._
import java.util._

object Solution {

    // Complete the staircase function below.
    def staircase(n: Int) {
        for(i <- 1 to n){
            //repeat strings in scala by multiplication
            print(" " * (n-i))
            println("#" * (i))
        }
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}
