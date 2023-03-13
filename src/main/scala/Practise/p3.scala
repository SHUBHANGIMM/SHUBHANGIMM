package Practise

object p3 {
  def main(args: Array[String]): Unit = {
    var x = 153
    var sum = 0
    var temp = x
    while (temp > 0) {
      var r = temp % 10
      sum += r * r * r
      temp = temp / 10
    }
    if (sum == x)
      println("amstrong number")
    else
      println("not")
  }
}
