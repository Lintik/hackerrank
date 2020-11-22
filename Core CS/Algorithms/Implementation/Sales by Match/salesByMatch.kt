import java.io.*
import java.text.*
import java.util.*
import kotlin.text.*

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    return ar.groupingBy{it}.eachCount().values.fold(0){ acc, b -> acc + b/2}
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
