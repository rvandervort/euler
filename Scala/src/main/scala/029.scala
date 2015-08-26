import scala.collection.mutable.ArrayBuffer

package euler {
  object TwentyNine {
    def calcResult(): Array[BigInt] = {
      var a = BigInt(0)
      var b = BigInt(0)
      var buf = ArrayBuffer[BigInt](10000)

      for (a <- 2 to 100) {
        for (b <- 2 to 100) {
          buf += BigInt(a).pow(b) 
        }
      }

      buf.toArray
    }

    def run_problem() {
      val res = calcResult().sorted.distinct

      println(res.length)
    }
  }
}
