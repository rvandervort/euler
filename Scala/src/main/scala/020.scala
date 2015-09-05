package euler;

import scala.annotation._

/**

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
**/
object Euler020 {
  def factorial(num: Int): BigInt = {

    @tailrec 
    def factorialAccum(num: Int, accum: BigInt): BigInt =
      if (num == 1) accum else factorialAccum(num - 1, accum * num)

    factorialAccum(num, BigInt(1))
  }

  def toDigitArray(value: BigInt): Array[Int] =
    value.toString.toCharArray.map(_.asDigit)

  def run_problem = 
    println(toDigitArray(factorial(100)).sum)
}
