package Practise

object p6 {
  def main(args: Array[String]): Unit = {
    def primes(n:Int):Boolean={
      var count=0
      for(i<-1 to 10){
        if(n<2) return false
        else if(n%i==0)
          count+=1
        else if(count==2) return true
      }
      false
    }
    println(primes(6))
  }
}
