package main

import "fmt"

func main() {
  var (
    i = 3
    sum_of_ints = 0
  )

  for i < 1000 {
    if i % 3 == 0 || i % 5 == 0 {
      sum_of_ints = sum_of_ints + i
    }

    i = i + 1
  }

  fmt.Println("the sum is: ", sum_of_ints)
}
