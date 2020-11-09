import java.io._
import java.text._
import java.util._

object Result {
    
    def gcd(a: Int, b: Int): Int {
        if (b == 0) 
            return a
        return gcd(b, a % b)
    }

    def gcd(a: Array[Int]): Int{
        var ans = a[0]
        for(i in 1 until a.size)
            ans = gcd(ans, a[i])
        return ans
    }

    def lcm(a: Int, b: Int): Int{
        return a * (b / gcd(a, b))
    }

    def lcm(a: Array[Int]): Int{
        var ans = a[0]
    
        for (i in 1 until a.size) 
            ans = (((a[i] * ans)) / (gcd(a[i], ans))) 
    
        return ans
    }


    def getTotalX(a: Array[Int], b: Array[Int]): Int = {
        var l = lcm(a)
        var g = gcd(b)
        
        var count = 0
        var i = l
        var j = 2
        while(i <= g){
            if(g%i==0)
                count++
                
            i = l * j
            j++
        }
        return count
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val m = firstMultipleInput(1).toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val total = Result.getTotalX(arr, brr)

        printWriter.println(total)

        printWriter.close()
    }
}
