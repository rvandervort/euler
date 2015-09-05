package main

import "fmt"

func reverse(n int) int {
  var reversed = 0
  for {
    if n <= 0 { break; }
    reversed = (10 * reversed) + (n % 10)
    n = n / 10
  }

  return reversed
}

func isPalindrome(n int) bool {
  if n == reverse(n) {
    return true
  } else {
    return false
  }
}

func main() {
  var largestPalindrome = 0
  var a = 999
  var b = 0
  var db = 0

  for {
    if (a < 100) { break; }

    if a % 11 == 0 {
      b = 99
      db = 1
    } else {
      b = 990
      db = 11
    }

    for {
      if b < a { break; }

      if a * b <= largestPalindrome { break; }

      if isPalindrome(a * b) { largestPalindrome = a * b }

      b = b - db
    }

    a = a - 1
  }


  fmt.Println("The largest palindrome is: ", largestPalindrome)
}
