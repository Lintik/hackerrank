import java.io.PrintWriter

object Solution {

    def pageCount(n: Int, p: Int): Int = {
        return Array(p/2,n/2-p/2).min
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val p = stdin.readLine.trim.toInt

        val result = pageCount(n, p)

        printWriter.println(result)

        printWriter.close()
    }
}
