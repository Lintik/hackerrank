import java.text._

object Solution {

    // Complete the compareTriplets function below.
    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        
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
