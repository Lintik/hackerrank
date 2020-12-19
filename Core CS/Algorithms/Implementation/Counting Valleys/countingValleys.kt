import java.io.*

fun countingValleys(steps: Int, path: String): Int {
    var depth = 0
    var t = 0
    for(i in 0 until steps){
        if(depth < 0){
            if(path[i]=='U')
                depth += 1
            else
                depth -= 1
            if(depth == 0) 
                t += 1
        }
        else
            if(path[i]=='U')
                depth += 1
            else
                depth -= 1
    }
    return t
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
