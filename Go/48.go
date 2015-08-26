package main

import "math"
import "fmt"

func ret(base float64) float64 {
  if base == 1 {
    return 1
  } else  {
    return ret(base - 1) + math.Pow(base, base)
  }
}

func main() {
  fmt.Printf("Result is : %f\n", ret(float64(1000)))
}
