import java.io.*
import java.util.*

fun staircase(n: Int): Unit {
    for(i in 1..n) {
        //repeat strings using CharSequence.repeat(n: Int): String
        print(" ".repeat(n-i))
        println("#".repeat(i))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
