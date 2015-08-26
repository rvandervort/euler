package euler {
  object Euler010 {
    lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i => ps.takeWhile{j => j * j <= i}.forall{ k => i % k > 0});

    def run_problem() = {
      println(ps.takeWhile(k => k < 2000000).map(_.toLong).sum)
    }
  }
}
