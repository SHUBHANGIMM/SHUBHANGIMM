package Practise

object P2 {
   def main(args: Array[String]): Unit = {
      def Palindrome(number1: String): Boolean = {
        val len= number1.length
        for(i <- 0 until len/2){
          if(number1(i)!=number1(len-i-1)) return false
        }
        return true
    }
    println(Palindrome("121"))
  }
}
