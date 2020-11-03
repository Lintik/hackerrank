import java.io.*
import java.text.*
import java.util.*

fun timeConversion(s: String): String {
    if (s[8] == 'P')
        if(s.slice(0..1) == "12")
            return s.slice(0..7)
        else
            return (s.slice(0..1).toInt() + 12).toString() + s.slice(2..7)
    else
        if(s.slice(0..1) == "12")
            return "00" + s.slice(2..7)
        else
            return s.slice(0..7)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
