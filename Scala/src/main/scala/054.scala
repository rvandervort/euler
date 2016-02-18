package euler

case class Card(rank: Char, suit: Char)
case class Round(left_hand: Hand, right_hand: Hand)

object Card {
  def apply(rank_and_suit: String) = {
    val ts = rank_and_suit.toCharArray

    new Card(ts(0), ts(1))
  }
}

class Hand(cards: List[Card]) {
  def score: Int = 0

  def highCard: Card = cards.head
}

object Euler054 {
  def run_problem {
    // Load the file
    // Get the hands as tuples


  }
}
