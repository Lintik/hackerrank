import java.io._
import java.text._
import java.util._
import scala.io._

object Solution {

    def migratoryBirds(ar: Array[Int]): Int = {
        var r = Array(0,0,0,0,0)

        for(a <- ar)
            r(a-1) =  r(a-1) + 1

        var mx = 0
        var mx_i = 0
        for(i <- 0 until 5){
            if(r(i) > mx){
                mx = r(i)
                mx_i = i
            }
        }
        return mx_i + 1

    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val result = migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
