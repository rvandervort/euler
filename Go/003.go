package main

import "fmt"

func main() {
  var x = 600851475143
  var i = 2
  var max = 0

  for {
    if x <= 1 { break; }

    if x % i == 0 {
      x = x / i
      max = i
    } else {
      i = i + 1
    }

  }

  fmt.Println("The answer is: ", max)
}
