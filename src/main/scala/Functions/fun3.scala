package Functions

object fun3 {
  def main(args: Array[String]): Unit = {
    var res = multiply(add2(10))
    println(res)
  }
    def add2(i: Int):Int={
      i+2
    }
    def multiply(i: Int):Int={
      i*2
    }

}
