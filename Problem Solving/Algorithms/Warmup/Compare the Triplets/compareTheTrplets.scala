import java.text._

object Solution {

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val alice = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val bob = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val (alicePoints, bobPoints) = alice.zip(bob).map { case (a, b) =>
            if (a > b) (1, 0)
            else if (b > a) (0, 1)
            else (0, 0)
            }.unzip
        println(s"${alicePoints.sum} ${bobPoints.sum}")
    }
}
