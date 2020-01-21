object Solution {

    def polygonArea(points: Seq[(Int, Int)]): Double = {
        def f(p1: (Int, Int), p2: (Int, Int)): Int = (p1._1 + p2._1) * (p1._2 - p2._2)
        math.abs((points.foldLeft(0.0, points.last){ (accu, p) => (accu._1 + f(accu._2, p), p)})._1 / 2)
    }

    def main(args: Array[String]): Unit = {
        val nPoints = io.StdIn.readInt()
        val points: Seq[(Int, Int)] = (1 to nPoints).map(_ => io.StdIn.readLine().split("\\s+")).map(p => (p(0).toInt,p(1).toInt))
        println(polygonArea(points))
    }
}