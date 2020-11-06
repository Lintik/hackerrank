import java.io._
import java.text._
import java.util._

object Solution {

    def numberLineJumps(x1: Int, v1: Int, x2: Int, v2: Int): String = {
         if(v2 >= v1)
            return "NO"
        if((x2-x1)%(v1-v2) == 0) 
            return "YES"
        else
            return "NO"
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
        val x1V1X2V2 = stdin.readLine.split(" ")
        val x1 = x1V1X2V2(0).trim.toInt
        val v1 = x1V1X2V2(1).trim.toInt
        val x2 = x1V1X2V2(2).trim.toInt
        val v2 = x1V1X2V2(3).trim.toInt
        val result = numberLineJumps(x1, v1, x2, v2)

        printWriter.println(result)
        printWriter.close()
    }
}
