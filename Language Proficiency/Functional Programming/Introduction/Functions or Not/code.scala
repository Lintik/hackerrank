object Solution {
    def main(args: Array[String]) {
        val n = io.StdIn.readInt()
        (1 to n).foreach { i =>
            val k = io.StdIn.readInt()
            val list = (1 to k).map(x => io.StdIn.readLine.split("\\s+")(0)).toList
            if (list.distinct.size == list.size) println("YES")
            else println("NO")
        }
    }
}