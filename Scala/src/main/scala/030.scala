/**
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
**/

package euler {
  object Thirty {
    def asDigits(input: BigInt): Array[BigInt] = input.toString.toCharArray.map{ x => BigInt(x.asDigit) }

    def raised(input: Array[BigInt], power: Int): Array[BigInt] = input.map { x => x.pow(power) }

    def digitFifth(input: BigInt): BigInt =  raised(asDigits(input), 5).sum

    def compute(): BigInt = (2 to 2000000).filter { x => digitFifth(x) == x }.sum

    def run_problem() = {
      println(s"The result is: ${compute()}")
    }
  }
}
