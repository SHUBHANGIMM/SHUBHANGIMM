package Practise

object P1 {
  def main(args: Array[String]): Unit = {
    var a=0
    def Fib(n: Int): Int = {
      if (n < 3) 1
      else
        Fib(n - 1) + Fib(n - 2)
    }
    for(a<-1 to 10){
      println(Fib(a))
    }
  }
}
