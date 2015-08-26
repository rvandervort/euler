
package euler {
  object Euler034 {

    val factMap: scala.collection.immutable.Map[Int, Int] = Map(
      0 -> 0,
      1 -> 1,
      2 -> 2,
      3 -> 6,
      4 -> 24,
      5 -> 120, 
      6 -> 720,
      7 -> 5040, 
      8 -> 40320,
      9 -> 362880
    )

    def asDigits(input: Int): Array[Int] = input.toString.toCharArray.map(_.asDigit)

    def factorial(input: Int): Int = factMap.get(input).get

    def sumFacts(input: Int): BigInt = asDigits(input).map(x => factorial(x)).foldLeft(BigInt(0)) { (a,b) => a + BigInt(b) }

    // Max is 9! * 7   (result is 7 digits).  
    // 9! * 8 is comparing an 8 digit number with a 7 digit number, which will never be equal

    def result = {
      (3 to 2540160).filter(x => x == sumFacts(x)).sum
    }

    def run_problem = println(s"The result is: ${result}")

  }
}
