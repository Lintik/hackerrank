import java.io._
import java.util._

object Solution {

    // Complete the hourglassSum function below.
    def hourglassSum(arr: Array[Array[Int]]): Int = {
        var m = 0
        for(i <- 0 until 4)
            for(j <- 0 until 4){
                var n = 0
                n += arr(i)(j) + arr(i)(j+1) + arr(i)(j+2)
                n += arr(i+1)(j+1)
                n += arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
                if(n > m)
                    m = n
            }
        return m
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arr = Array.ofDim[Int](6, 6)

        for (i <- 0 until 6) {
            arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
        }

        val result = hourglassSum(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
