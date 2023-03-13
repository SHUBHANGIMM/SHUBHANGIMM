package collection

import scala.util.Random

object vector {
  def main(args: Array[String]): Unit = {
    val maxRuns = 1000
    val maxCapcity = 1000000

    def getWriterTime(collection: Seq[Int]): Double = {
      val r = new Random
      val times = for {
        it <- 1 to maxRuns
      } yield {
        val currentTime = System.nanoTime()
        val x = r.nextInt(maxCapcity)
        println(x)
        collection.updated(x, 0)
        System.nanoTime() - currentTime
      }
      times.sum * 1.0 / maxRuns
    }

    val numberList = (1 to maxCapcity).toList
    val numberVector = (1 to maxCapcity).toVector

    println(getWriterTime(numberList))
    //println(getWriterTime(numberVector))

  }
}
