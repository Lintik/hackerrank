import java.io.*
import java.text.*
import java.util.*

fun plusMinus(arr: Array<Int>): Unit {
    println("%.6f".format(arr.filter{ it > 0}.size.toFloat() / arr.size.toFloat()))
    println("%.6f".format(arr.filter{ it < 0}.size.toFloat() / arr.size.toFloat()))
    println("%.6f".format(arr.filter{ it == 0}.size.toFloat() / arr.size.toFloat()))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(' ').map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
    scan.close()
}