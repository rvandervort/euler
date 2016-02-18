package euler

object Thirty {
  def asDigits(input: BigInt): Array[BigInt] = input.toString.toCharArray.map{ x => BigInt(x.asDigit) }

  def raised(input: Array[BigInt], power: Int): Array[BigInt] = input.map { x => x.pow(power) }

  def digitFifth(input: BigInt): BigInt =  raised(asDigits(input), 5).sum

  def compute(): BigInt = (2 to 2000000).filter { x => digitFifth(x) == x }.sum

  def run_problem() = {
    println(s"The result is: ${compute()}")
  }
}
