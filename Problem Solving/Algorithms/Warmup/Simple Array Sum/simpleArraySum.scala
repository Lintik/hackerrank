import java.io.PrintWriter

object Solution {

    def simpleArraySum(ar: Array[Int]): Int = {
        //sum the array by using foldLeft
        return ar.foldLeft(0)(_+_);
        //sum the array by using sum
        return ar.sum;

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = simpleArraySum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}
