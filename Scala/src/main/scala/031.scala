package euler {
  object ThirtyOne {
      def countChange(amount: Int, coins: List[Int]): Int = {
        def countChangeHelper(amount: Int, coins: List[Int]): Int = {
          if (amount == 0)
            1
          else
            if (amount < 0 || coins.isEmpty)
              0
            else
              countChangeHelper(amount, coins.tail) + countChangeHelper(amount - coins.head, coins)
        }

        countChangeHelper(amount, coins)
      }


      def run_problem() {
        println(s"The amount is: ${countChange(200, List(1,2,5,10,20,50,100,200))}")
      }
  }
}
