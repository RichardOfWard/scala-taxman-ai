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

      val startTimeInMicroSeconds = System.nanoTime()

      val bestGame = findBestGame(new TaxmanGameState(gameSize))

      val timeTakenInSeconds = ((System.nanoTime() - startTimeInMicroSeconds) / 1000000).toFloat / 1000.0

      println(bestGame.playerScore)
      println(bestGame.playerValues)
      println(s"Took $timeTakenInSeconds seconds")
    }

    def findBestGame(state: TaxmanGameState): TaxmanGameState =
      state.availableMoves
        .map(state.move)
        .par.map(findBestGame)
        .fold(state) {(a,b) => List(a, b).maxBy(_.playerScore)}
  }
}
