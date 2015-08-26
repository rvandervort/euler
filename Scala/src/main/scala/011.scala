package euler {
  object Euler011 {
    val full_list = List(
      List(8L,2L,22L,97L,38L,15L,0L,40L,0L,75L,4L,5L,7L,78L,52L,12L,50L,77L,91L,8L),
      List(49L,49L,99L,40L,17L,81L,18L,57L,60L,87L,17L,40L,98L,43L,69L,48L,4L,56L,62L,0L),
      List(81L,49L,31L,73L,55L,79L,14L,29L,93L,71L,40L,67L,53L,88L,30L,3L,49L,13L,36L,65L),
      List(52L,70L,95L,23L,4L,60L,11L,42L,69L,24L,68L,56L,1L,32L,56L,71L,37L,2L,36L,91L),
      List(22L,31L,16L,71L,51L,67L,63L,89L,41L,92L,36L,54L,22L,40L,40L,28L,66L,33L,13L,80L),
      List(24L,47L,32L,60L,99L,3L,45L,2L,44L,75L,33L,53L,78L,36L,84L,20L,35L,17L,12L,50L),
      List(32L,98L,81L,28L,64L,23L,67L,10L,26L,38L,40L,67L,59L,54L,70L,66L,18L,38L,64L,70L),
      List(67L,26L,20L,68L,2L,62L,12L,20L,95L,63L,94L,39L,63L,8L,40L,91L,66L,49L,94L,21L),
      List(24L,55L,58L,5L,66L,73L,99L,26L,97L,17L,78L,78L,96L,83L,14L,88L,34L,89L,63L,72L),
      List(21L,36L,23L,9L,75L,0L,76L,44L,20L,45L,35L,14L,0L,61L,33L,97L,34L,31L,33L,95L),
      List(78L,17L,53L,28L,22L,75L,31L,67L,15L,94L,3L,80L,4L,62L,16L,14L,9L,53L,56L,92L),
      List(16L,39L,5L,42L,96L,35L,31L,47L,55L,58L,88L,24L,0L,17L,54L,24L,36L,29L,85L,57L),
      List(86L,56L,0L,48L,35L,71L,89L,7L,5L,44L,44L,37L,44L,60L,21L,58L,51L,54L,17L,58L),
      List(19L,80L,81L,68L,5L,94L,47L,69L,28L,73L,92L,13L,86L,52L,17L,77L,4L,89L,55L,40L),
      List(4L,52L,8L,83L,97L,35L,99L,16L,7L,97L,57L,32L,16L,26L,26L,79L,33L,27L,98L,66L),
      List(88L,36L,68L,87L,57L,62L,20L,72L,3L,46L,33L,67L,46L,55L,12L,32L,63L,93L,53L,69L),
      List(4L,42L,16L,73L,38L,25L,39L,11L,24L,94L,72L,18L,8L,46L,29L,32L,40L,62L,76L,36L),
      List(20L,69L,36L,41L,72L,30L,23L,88L,34L,62L,99L,69L,82L,67L,59L,85L,74L,4L,36L,16L),
      List(20L,73L,35L,29L,78L,31L,90L,1L,74L,31L,49L,71L,48L,86L,81L,16L,23L,57L,5L,54L),
      List(1L,70L,54L,71L,83L,51L,54L,69L,16L,92L,33L,48L,61L,43L,52L,1L,89L,19L,67L,48L)
    )

    type LongMatrix = List[List[Long]]

    def sliding_max(the_list: List[Long]) = the_list.sliding(4).map(x => x.product).max

    def horizontal_max(the_list: LongMatrix) = the_list.map(sliding_max).max

    def vertical_max(the_list: LongMatrix) = horizontal_max(the_list.transpose)

    def diagonal_max(the_list: LongMatrix) = {
      val val_array = the_list.map(x => x.toArray).toArray

      def forward_slice(start_y: Int): List[Long] = {
        def sliceHelper(x: Int, y: Int, vals: List[Long]): List[Long] = {
          if (y < 0)
            vals
          else
            sliceHelper(x + 1, y - 1, val_array(x)(y) :: vals)
        }

        sliceHelper(0, start_y, Nil)
      }

      def backward_slice(start_x: Int): List[Long] = {
        def sliceHelper(x: Int, y: Int, vals: List[Long]): List[Long] = {
          if (x < 0)
            vals
          else
            sliceHelper(x - 1, y - 1, val_array(x)(y) :: vals)
        }

        sliceHelper(start_x, 19, Nil)
      }
      
      val fwd_max = (0 until 20).map { y => sliding_max(forward_slice(y)) }.max
      val bck_max = (0 until 20).map { x => sliding_max(backward_slice(x)) }.max

      if (fwd_max > bck_max) fwd_max else bck_max
    }

    def run_problem() {
      println(
        List(horizontal_max(full_list), vertical_max(full_list), diagonal_max(full_list)).max
      )
    }
  }
}
