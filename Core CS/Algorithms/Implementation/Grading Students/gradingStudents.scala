import java.io._
import java.text._
import java.util._
import scala.io._

object Result {

    def gradingStudents(grades: Array[Int]): Array[Int] = {
        return grades.map(g => if (g < 38 || g % 5 < 3) g else g + 5 - (g % 5))
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val gradesCount = StdIn.readLine.trim.toInt

        val grades = Array.ofDim[Int](gradesCount)

        for (i <- 0 until gradesCount) {
            val gradesItem = StdIn.readLine.trim.toInt
            grades(i) = gradesItem
        }

        val result = Result.gradingStudents(grades)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
