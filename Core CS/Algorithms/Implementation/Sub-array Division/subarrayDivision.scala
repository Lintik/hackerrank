import java.io._
import java.text._
import java.util._
import scala.io._

object Solution {

    def birthday(s: Array[Int], d: Int, m: Int): Int = {
        var t = 0
        var c = 0
        for(i <- 0 until m) 
            t += s(i)

        if(t==d)
            c += 1
        
        for(i <- m until s.size){
            t = t - s(i-m) + s(i)
            if(t==d)
                c += 1
        }
        return c
    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val d = dm(0).toInt

        val m = dm(1).toInt

        val result = birthday(s, d, m)

        printWriter.println(result)

        printWriter.close()
    }
}
