import java.io.*
import java.util.*

import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    var m = 0
    for(i in 0 until 4)
        for(j in 0 until 4){
            var n = 0
            n += arr[i][j] + arr[i][j+1] + arr[i][j+2]
            n += arr[i+1][j+1]
            n += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
            if(n > m)
                m = n
        }
    return m

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
