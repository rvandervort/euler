package main

import "fmt"


func makeFibGenerator() func() uint {
  a := uint(0)
  b := uint(1)

  return func() (ret uint) {
    ret = a + b
    a = b
    b = ret

    return ret
  }
}

func main() {
   fib := makeFibGenerator()
   var (
    sum_of_fib uint = 0
    current_value uint = 0
   )

   for current_value < 4000000 {
      current_value = fib()
      if current_value % 2 == 0 {
        sum_of_fib = sum_of_fib + current_value
      }
   }

   fmt.Println("the sum is: ", sum_of_fib)
}
