// To calculate n'th term, requires a list of ascending numbers starting from 1 e.g. 1, 2, 3...
//def f(x:Double, list:List[Double]):Double = list.foldLeft(1.0)((a, b) => a * x / b)

// To sum first 10 terms
//def eF(x: Double):Double = Range(1, 10).toList.map(_.toDouble).inits.foldLeft(0.0)((a, b) => a + f(x, b))
    
// Call this in main loop for solution
//println(eF(x))

object Solution {
    
    def factorial(n:Int):Int = if (n==0) 1 else n * factorial(n-1)
    
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a0 = 0;
        while(a0 < n){
            var x = sc.nextDouble();
            val sum1 = (0 to 9).toList.map{case a=> Math.pow(x,a)/factorial(a)}.reduce(_+_)
            a0+=1;
            println("%.4f".format(sum1))
        }
    }
}