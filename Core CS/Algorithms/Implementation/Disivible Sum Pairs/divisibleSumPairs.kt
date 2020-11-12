import java.io.*
import java.text.*
import java.util.*

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var c=0
    for(i in  0 until n - 1)
        for(j in i+1 until n)
            if((ar[i] + ar[j]) % k == 0) 
                c += 1
    return c

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
