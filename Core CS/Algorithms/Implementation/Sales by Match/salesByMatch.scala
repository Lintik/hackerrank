import java.io._
import java.text._
import java.util._

object Solution {

    def sockMerchant(n: Int, ar: Array[Int]): Int = {
        return ar.groupBy(identity).mapValues(_.size).foldLeft(0){ case (a, (k, v)) => a + v/2}
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = sockMerchant(n, ar)

        printWriter.println(result)

        printWriter.close()
    }
}
