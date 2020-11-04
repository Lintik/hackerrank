import java.io.*
import java.text.*
import java.util.*
import kotlin.collections.*

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map({g -> if (g < 38 || g % 5 < 3) g else g + 5 - (g % 5)}).toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
