import java.io.*
import java.text.*
import java.util.*

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val s = bill.sum() - bill[k]
    
    if(b - s/2 == 0)
        println("Bon Appetit")

    else
        println(b - s/2)

}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
