import java.io.PrintWriter

object Solution {

    def timeConversion(s: String): String = {
        if(s(8) == 'P')
            if( s.substring(0,2) == "12")
                return s.substring(0,8)
            else
                return (s.substring(0,2).toInt + 12).toString + s.substring(2,8)
        else
            if(s.substring(0,2) == "12")
                return "00" + s.substring(2,8)
            else
                return s.substring(0,8)
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = scan.readLine

        val result = timeConversion(s)

        fw.println(result)

        fw.close()
    }
}
