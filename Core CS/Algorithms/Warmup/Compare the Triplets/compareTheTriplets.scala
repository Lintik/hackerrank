import java.io._
import java.text._
import scala.io._

object Solution {

    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        val r = Array(0,0)
        if (a(0) > b(0)) r(0) += 1 else if (b(0) > a(0)) r(1) += 1 else r(0) = r(0)
        if (a(1) > b(1)) r(0) += 1 else if (b(1) > a(1)) r(1) += 1 else r(0) = r(0)
        if (a(2) > b(2)) r(0) += 1 else if (b(2) > a(2)) r(1) += 1 else r(0) = r(0)
        return r
    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val result = compareTriplets(a, b)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
