import java.text._

object Solution {

    // Complete the compareTriplets function below.
    def compareTriplets(alice: Array[Int], bob: Array[Int]) {
        val (alicePoints, bobPoints) = alice.zip(bob).map { case (a, b) =>
            if (a > b) (1, 0)
            else if (b > a) (0, 1)
            else (0, 0)
            }.unzip
        println(s"${alicePoints.sum} ${bobPoints.sum}")      
        
    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val result = compareTriplets(a, b)
    }
}
