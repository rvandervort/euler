import scala.annotation.tailrec

// Project Euler - problem 36.  Binary and Decimal palindromes
package euler {
  object ThirtySix {
    def isPalindrome(input: String): Boolean = {
      val chars = input.toCharArray

      @tailrec def helper(start: Int, end: Int): Boolean = {
        if (start >= end)
          true
        else
          if (chars(start) == chars(end)) helper(start + 1, end - 1) else false
      }

      helper(0, chars.length - 1)
    }

    def base10Palindrome(input: Int): Boolean = isPalindrome(input.toString)

    def base2Palindrome(input: Int): Boolean = isPalindrome(input.toBinaryString)

    def isFullPalindrome(input: Int): Boolean = base2Palindrome(input) && base10Palindrome(input)

    def run_problem() = {
      println((1 until 1000000).filter(isFullPalindrome).sum)
    }
  }
}
