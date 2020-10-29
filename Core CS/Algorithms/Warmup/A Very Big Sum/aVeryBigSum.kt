import java.io.*
import java.util.*

fun simpleArraySum(ar: Array<Long>): Long {
    //built in sum()
    //return ar.sum()
    
    //stream fold()
    return ar.fold(0L) { acc, e -> acc + e }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toLong()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
