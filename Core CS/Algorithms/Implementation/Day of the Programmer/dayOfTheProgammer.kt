import java.io.*
import java.text.*
import java.util.*

fun dayOfProgrammer(year: Int): String {
    var mon7 = 215
    var feb = 28 //days in february
    if(year < 1918) //julian
        feb =  if (year%4 > 0) 28 else 29
    else if(year > 1918) //gregorian
        feb = if(!(year%400 > 0) || (year%100 > 0)&& !(year%4 > 0)) 29 else 28
    else // 1918
        feb = 15
        
    feb = 256 - (feb + mon7)
    return feb.toString() + ".09." + year.toString()

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
