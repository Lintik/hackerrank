import java.io._
import java.text._
import java.util._

object Solution {

    def breakingRecords(scores: Array[Int]): Array[Int] = {


    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val scores = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = breakingRecords(scores)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
