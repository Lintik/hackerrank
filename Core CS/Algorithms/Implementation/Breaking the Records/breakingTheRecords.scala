import java.io._
import java.text._
import java.util._

object Solution {

    def breakingRecords(scores: Array[Int]): Array[Int] = {
        var maxc, minc = 0
        var m, n = scores(0)
        
        for(i <- 1 until scores.size)
            if (m < scores(i)){
                m = scores(i)
                maxc += 1
            }
            else if (n > scores(i)){
                n = scores(i)
                minc += 1
            }
        
        return Array(maxc,minc)
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
