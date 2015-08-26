package euler {
  object Euler006 {
    def run_problem() {

       def sumSquares(range: scala.collection.immutable.Range.Inclusive) : Double = {
          range.map( math.pow(_, 2) ).reduce(_+_)
       }

       def squareSums(range: scala.collection.immutable.Range.Inclusive) : Double = {
          math.pow(range.reduce(_+_), 2)
       }


       val range = (1 to 100)
       val vSquareSums = squareSums(range)
       val vSumSquares = sumSquares(range)

       println("Square of Sums: " + vSquareSums)
       println("Sum of Squares: " + vSumSquares)
       println("\n")
       println("Difference is: " + (vSquareSums - vSumSquares))

    }
  }
}
