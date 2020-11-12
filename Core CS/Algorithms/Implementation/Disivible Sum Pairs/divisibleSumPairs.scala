import java.io._
import java.text._
import java.util._

object Solution {

    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
        var c=0
        for(i <- 0 until n - 1)
            for(j <- i+1 until n)
                if((ar(i) + ar(j)) % k == 0) 
                    c += 1
        return c
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nk = stdin.readLine.split(" ")

        val n = nk(0).trim.toInt

        val k = nk(1).trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = divisibleSumPairs(n, k, ar)

        printWriter.println(result)

        printWriter.close()
    }
}
