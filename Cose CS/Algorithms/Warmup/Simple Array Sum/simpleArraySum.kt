import java.util.*

fun simpleArraySum(ar: Array<Int>): Int {
    //var for mutable, val for immutable
    var t: Int = 0
    for(i in ar)
        t += i
    return t
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
    scan.close();
}
