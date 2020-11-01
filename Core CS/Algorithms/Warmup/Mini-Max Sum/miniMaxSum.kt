import java.io.*
import java.util.*
import java.text.*
import kotlin.collections.*

fun miniMaxSum(arr: Array<Long>){
    var ma = 1L
    var mi = 1000000000L
    var s = 0L
    for(i in 1..arr.size){
        s += arr[i-1]
        if(arr[i-1] > ma) 
            ma = arr[i-1]
        if(arr[i-1] < mi) 
            mi = arr[i-1]
    }
    println((s - ma).toString() + " " + (s - mi).toString())
}

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    miniMaxSum(ar)
}