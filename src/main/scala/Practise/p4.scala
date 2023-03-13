package Practise

object p4 extends App {

    val x = 121
    var sum = 0
    var temp = x
    while (temp > 0) {
      var r = temp % 10
      sum = (sum*10) + r
      temp = temp / 10
      if (sum == x)
        println("its is palindrome")
      else
        println("not")
    }
}
