import math._

package euler {
  object Euler092 {
    def asDigits(input: Int): Array[Int] = input.toString.toCharArray.map(x => x.asDigit)

    def sumSquaredDigits(input: Int): Int = {
      def helper(num: Int): Int  = {
        num match {
          case 1    => 0
          case 89   => 1
          case the_num => helper(asDigits(the_num).map(x => pow(x.doubleValue, 2).intValue).sum)
        }
      }
      
      helper(input)
    }

    def count_89: Int = {
      (1 until 10000000).map(x => sumSquaredDigits(x)).sum
    }

    def run_problem = {
      println(s"The count is: ${count_89}")
    }
  }
}
