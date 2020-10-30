import java.io._
import java.text._
import scala.io

object Solution {

    def plusMinus(arr: Array[Int]) {
        println("%1.6f".format(arr.filter(_ > 0).length.toFloat / arr.length.toFloat))
        println("%1.6f".format(arr.filter(_ < 0).length.toFloat / arr.length.toFloat))
        println("%1.6f".format(arr.filter(_ == 0).length.toFloat / arr.length.toFloat))

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}
