import java.io._
import java.text._

object Result {

    def diagonalDifference(arr: Array[Array[Int]]): Int = {

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val arr = Array.ofDim[Int](n, n)

        for (i <- 0 until n) {
            arr(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        }

        val result = Result.diagonalDifference(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
