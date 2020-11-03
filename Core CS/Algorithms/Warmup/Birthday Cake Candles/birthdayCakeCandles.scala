import java.io._
import java.text._
import java.util._
import scala.io._


object Result {

    def birthdayCakeCandles(candles: Array[Int]): Int = {
        val mx = candles.max
        return candles.filter(_ == mx).length
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val candlesCount = StdIn.readLine.trim.toInt

        val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.birthdayCakeCandles(candles)

        printWriter.println(result)

        printWriter.close()
    }
}
