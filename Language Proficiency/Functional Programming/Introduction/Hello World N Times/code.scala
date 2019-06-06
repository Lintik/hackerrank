object Solution extends App {
    def f(n: Int) = Stream.fill(n)("Hello World") foreach {println}

    var n = scala.io.StdIn.readInt
    f(n)
}