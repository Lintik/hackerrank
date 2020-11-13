import java.io._
import java.text._
import java.util._
import scala.io._

object Solution {

    def dayOfProgrammer(year: Int): String = {
        var mon7 = 215
        var feb = 28 //days in february
        if(year < 1918) //julian
            feb =  if (year%4 > 0) 28 else 29
        else if(year > 1918) //gregorian
            feb = if(!(year%400 > 0) || (year%100 > 0)&& !(year%4 > 0)) 29 else 28
        else // 1918
            feb = 15
            
        feb = 256 - (feb + mon7)
        return feb.toString + ".09." + year.toString

    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val year = StdIn.readLine.trim.toInt

        val result = dayOfProgrammer(year)

        printWriter.println(result)

        printWriter.close()
    }
}
