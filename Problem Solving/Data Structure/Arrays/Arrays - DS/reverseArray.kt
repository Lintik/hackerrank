import java.io.*
import java.util.*
import java.util.Arrays


// Complete the reverseArray function below.
fun reverseArray(a: Array<Int>): Array<Int> {
    //using reversedArray()
    //Reverse an array and create one different array
    //return a.reversedArray()
    
    //using reverse()
    //Reverse an array in place
    a.reverse()
    return a

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arrCount = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
