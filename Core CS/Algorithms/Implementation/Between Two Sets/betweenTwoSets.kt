import java.io.*
import java.text.*
import java.util.*

fun gcd(a: Int, b: Int): Int{
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
}

fun gcd(a: Array<Int>): Int{
    var ans = a[0];
    for(i in 1 until a.size)
        ans = gcd(ans, a[i])
    return ans;
}

fun lcm(a: Int, b: Int): Int{
    return a * (b / gcd(a, b));
}

fun lcm(a: Array<Int>): Int{
    var ans = a[0]; 
  
    for (i in 1 until a.size) 
        ans = (((a[i] * ans)) / (gcd(a[i], ans))); 
  
    return ans; 
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var l = lcm(a)
    var g = gcd(b)
    
    var count = 0
    for(int i = l, j =2; i<=g; i=l*j,j++){
        if(g%i==0)
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
