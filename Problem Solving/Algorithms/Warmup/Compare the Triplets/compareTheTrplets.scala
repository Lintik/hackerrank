import java.io._
import java.text._

object Solution extends App {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val lines = io.Source.stdin.getLines()
    val total = lines.next().split(" ").map(_.toInt).zip(lines.next().split(" ").map(_.toInt)).fold((0,0)){ case (acc, pair) =>
    if(pair._1 > pair._2)
        (acc._1+1, acc._2)
    else if(pair._1 < pair._2)
        (acc._1, acc._2+1)
    else
        acc
    }
    
    printWriter.println(s"${total._1} ${total._2}")
    printWriter.close()
}