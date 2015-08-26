package euler {
  object Euler002 {
    def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)

    def run_problem() = {
      var sum = 0

      sum = fibFrom(1,1).filter(_ % 2 == 0).takeWhile(_ < 4000000).reduce(_+_)

      println("The sum is: " + sum)
    }
  }
}
