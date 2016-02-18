package euler {
  object Euler005 {
    def isSolution(num: Int, rem: List[Int]): Boolean = {
      if (rem.isEmpty)
        true
      else
        if (num % rem.head == 0)
          isSolution(num, rem.tail)
        else
          false
    }

    def checkHelper(original: Int, multiplier: Int, list: List[Int]): Int = {
      if (isSolution(original * multiplier, list))
        original * multiplier
      else
        checkHelper(original, multiplier + 1, list)
    }

    def lcm(l: List[Int]): Int = {
      val max = l.max

      val rem = l.diff(List(max))

      return checkHelper(max, 1, rem)
    }

    def run_problem() {
      val ints  = List(6,7,8,9,10)
      val ints2 = List(6,7,9,10,11,12,13,14,15,16,17,18,19,20)

      println("LCM (1-10): " + lcm(ints))
      println("LCM (1-20): " + lcm(ints2))
    }
  }
}
