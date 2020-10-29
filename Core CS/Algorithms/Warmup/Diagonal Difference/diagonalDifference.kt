import java.io.*
import java.util.*
import kotlin.math.absoluteValue

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var d1 = 0
    var d2 = 0
    val n = arr.size - 1
    for (i in 0..n) {
        for (j in 0..n) {
            if (i == j) d1 += arr[i][j]
            if (i == arr.size - j - 1) d2 += arr[i][j]
        }
    }
    return (d1 - d2).absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
