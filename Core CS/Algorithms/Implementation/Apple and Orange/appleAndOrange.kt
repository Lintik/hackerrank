import java.io.*
import java.text.*
import java.util.*
import kotlin.io.*

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    println(apples.filter{it + a >= s && it + a <= t}.size)
    println(oranges.filter{it + b >= s && it + b <= t}.size)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val st = scan.nextLine().split(" ")
    val s = st[0].trim().toInt()
    val t = st[1].trim().toInt()
    val ab = scan.nextLine().split(" ")
    val a = ab[0].trim().toInt()
    val b = ab[1].trim().toInt()
    val mn = scan.nextLine().split(" ")
    val m = mn[0].trim().toInt()
    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
