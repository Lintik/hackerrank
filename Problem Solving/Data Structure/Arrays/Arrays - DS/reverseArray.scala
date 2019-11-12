import java.io._
import java.util._

object Solution {

    // Complete the reverseArray function below.
    def reverseArray(array: Array[Int]): Array[Int] = {
        var idx = 0
        var xdi = array.length - 1
        while (idx < xdi) {
            val tmp1 = array(idx)
            val tmp2 = array(xdi)
            array(idx) = tmp2
            array(xdi) = tmp1
            idx += 1
            xdi -= 1
        }
        return array
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val res = reverseArray(arr)

        printWriter.println(res.mkString(" "))

        printWriter.close()
    }
}
