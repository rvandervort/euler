import math.pow
import math.sqrt

package euler {
  object Euler009 {
    def run_problem() {
      for (a <- (1 to 1000)) {
        for (b <- ((a+1) to 1000)) {
          val a2 = pow(a,2)
          val b2 = pow(b,2)

          val c = sqrt(a2 + b2)

          if (a + b + c == 1000.00) {
            printf(s"The product is: %f\n", a * b * c)
            println(s"\ta = ${a}\n\tb = ${b}\n\tc = ${c}")
          }
        }
      }
    }
  }
}
