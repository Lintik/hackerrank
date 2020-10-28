import java.io._
import java.util._

object Solution {

    def aVeryBigSum(ar: Array[Long]): Long = {
        //reduceLeft has no initial value
        //return ar.reduceLeft(_+_)
        //foldLeft has initial value
        return ar.foldLeft(0l)(_+_)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toLong)
        val result = aVeryBigSum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}
