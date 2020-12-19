import java.io._
import scala.io._

object Result {

    def countingValleys(steps: Int, path: String): Int = {
        var depth = 0
        var t = 0
        for(i <- 0 until steps){
            if(depth < 0){
                if(path(i)=='U')
                    depth += 1
                else
                    depth -= 1
                if(depth == 0) 
                    t += 1
            }
            else
                if(path(i)=='U')
                    depth += 1
                else
                    depth -= 1
        }
        return t

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val steps = StdIn.readLine.trim.toInt

        val path = StdIn.readLine

        val result = Result.countingValleys(steps, path)

        printWriter.println(result)

        printWriter.close()
    }
}
