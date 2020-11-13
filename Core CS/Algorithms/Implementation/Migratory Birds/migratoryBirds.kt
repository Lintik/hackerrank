import java.io.*
import java.text.*
import java.util.*

fun migratoryBirds(ar: Array<Int>): Int {
    var r = arrayOf<Int>(0,0,0,0,0)

    for(a in ar)
        r[a-1]++

    var mx = 0
    var mx_i = 0
    for(i in 0 until 5){
        if(r[i] > mx){
            mx = r[i]
            mx_i = i
        }
    }
    return mx_i + 1

}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
