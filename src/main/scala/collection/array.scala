package collection

object array {
  def main(args: Array[String]): Unit = {
    val c= new coding()
    c.show()
  }

  class coding {
    var arr = Array(2, 2, 3, 4, 77)

    def show(): Unit = {
      for (a <- arr) {
        println(a)
        println("third element=" + arr(2))
      }
    }
  }
}