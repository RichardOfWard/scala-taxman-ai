import scala.collection.immutable.{Queue, ListSet}

class TaxmanGameState(val gameSize: Int, val playerValues: Queue[Int] = Queue[Int]()) {
  def move(v: Int) = new TaxmanGameState(gameSize, playerValues :+ v)

  val playerScore: Int =
    playerValues.sum

  private val allValues: Set[Int] =
    (1 to gameSize).toSet

  private val divisorsOfPlayerValues =
    allValues.filter(v => playerValues.exists(_ % v == 0))

  private val unclaimedValues =
    allValues.diff(playerValues.toSet).diff(divisorsOfPlayerValues)

  val availableMoves =
    unclaimedValues.filter(hasUnclaimedDivisor)

  private def hasUnclaimedDivisor(v: Int): Boolean = unclaimedValues.filter(v != _).exists(v % _ == 0)
}

object App {
  def main(args: Array[String]): Unit = {
    for (gameSize <- 1 to 30) {
      println(s"Finding an optimal solution for $gameSize...")
      var bestState = new TaxmanGameState(gameSize)
      var currentStates = Set(new TaxmanGameState(gameSize))
      val startTimeInMicroSeconds = System.nanoTime()

      while (currentStates.nonEmpty) {
        currentStates = currentStates.map(
          state => {
            if (state.playerScore > bestState.playerScore) {
              bestState = state
            }
            state.availableMoves.map(state.move)
          }
        ).flatten
      }

      val timeTakenInSeconds = ((System.nanoTime() - startTimeInMicroSeconds) / 1000000).toFloat / 1000.0

      println(bestState.playerScore)
      println(bestState.playerValues)
      println(s"Took $timeTakenInSeconds seconds")
    }
  }
}
