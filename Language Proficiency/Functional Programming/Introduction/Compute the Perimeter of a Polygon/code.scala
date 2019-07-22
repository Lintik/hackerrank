object Solution {

    def main(args: Array[String]) {
        def distance(p1:(Int,Int),p2:(Int,Int)): Double =
            math.sqrt(math.pow(p1._1-p2._1,2)+math.pow(p1._2-p2._2,2))
  
        var lines = io.Source.stdin.getLines()

        val n = lines.next.toInt
        var points = lines.take(n).toList map (s => s.split(" ")) map {case Array(e1,e2) => (e1.toInt,e2.toInt)}

        var polygLine = points :+ points.head

        var perimeter= (polygLine.tail.foldLeft((0.0,polygLine.head)){case (acc,p)=> (acc._1+distance(acc._2,p),p)})._1

        println(perimeter)
    }
}

