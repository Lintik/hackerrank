import java.util.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val r = arrayOf<Int>(0,0)
    
    if(a[0] > b[0]) r[0] += 1
    else if(a[0] < b[0])  r[1] += 1

    if(a[1] > b[1])  r[0] += 1
    else if(a[1] < b[1])  r[1] += 1

    if(a[2] > b[2])  r[0] += 1
    else if(a[2] < b[2])  r[1] += 1

    return r
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
