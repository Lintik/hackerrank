import java.text._

object Solution {

    // Complete the compareTriplets function below.
    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        int[] r = new int[]{0,0}

        if(a0 > b0) r[0]++
        else if(a0 < b0) r[1]++

        if(a1 > b1) r[0]++
        else if(a1 < b1) r[1]++

        if(a2 > b2) r[0]++
        else if(a2 < b2) r[1]++
        
        return r
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
