import java.io.*
import java.text.*
import java.util.*
import kotlin.math.*

fun pageCount(n: Int, p: Int): Int {
    return min(p/2,n/2-p/2)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
