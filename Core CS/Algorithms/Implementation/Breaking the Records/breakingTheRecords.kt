import java.io.*
import java.text.*
import java.util.*

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxc = 0.toInt()
    var minc = 0.toInt()
    var m = scores[0]
    var n = scores[0]
    
    for(i in 1 until scores.size){
        if (m < scores[i]){
            m = scores[i]
            maxc += 1
        }
        if (n > scores[i]){
            n = scores[i]
            minc += 1
        }
    }
    
    return arrayOf<Int>(maxc , minc)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
