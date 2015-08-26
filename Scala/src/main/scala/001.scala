package euler {
  object Euler001 {
    def calc = (1 until 1000).filter { x => x % 3 == 0 || x % 5 == 0 }.sum

    def run_problem = println(s"The sum is --: ${calc}")
  }
}
