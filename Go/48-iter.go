package main

import "math"
import "fmt"


func main() {
  var sum float64 = 0
  var i float64 = 0

  for i = 1; i <= 1000; i++  {
    sum = sum + (math.Pow(i, i))
  }
}
