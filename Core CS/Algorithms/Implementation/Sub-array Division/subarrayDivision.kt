import java.io.*
import java.text.*
import java.util.*

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var t=0;
    var c=0;
    for(i in 0 until m) t+=s[i];

    if(t==d) c++;
    
    for(i in m until s.size){
        t = t - s[i-m] + s[i];
        if(t==d) c++;
    }
    return c;
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
