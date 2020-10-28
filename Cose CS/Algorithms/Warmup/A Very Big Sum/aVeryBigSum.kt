import java.io.*
import java.util.*

fun simpleArraySum(ar: Array<Int>): Int {
    //built in sum()
    //return ar.sum()
    
    //stream fold()
    return ar.fold(0) { acc, e -> acc + e }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
