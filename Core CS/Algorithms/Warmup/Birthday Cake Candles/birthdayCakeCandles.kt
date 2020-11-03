import java.io.*
import java.text.*
import java.util.*
import kotlin.collections.*

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val mx = candles.max()
    return candles.filter{it == candles.max()}.size
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
