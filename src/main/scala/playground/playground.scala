package playground

import scala.annotation.tailrec
import scala.jdk.Accumulator

object playground {
  def main(args: Array[String]): Unit = {

    /* val x: Int=42
    println(x) */
    //val x=1+2
    //println(!(1==x))
    //val aCondition=false
    //val aConditionValue =if(aCondition) 5 else 3
    //println(aConditionValue)
    /*def aFunction(a:String,b:Int): String ={
      a+"  "+b
    }
    println(aFunction("hell o",3)) */
    /*def factFunction(n: Int): Int =
      if (n <= 0) 1
      else n * factFunction(n - 1)

    println(factFunction(5))

    def fibF(n: Int): Int =
      if (n <= 2) 1
      else fibF(n - 1) + fibF((n - 2))

    println(fibF(5))

     */
    /*
   @tailrec
    def concatenateString(aString: String, n: Int, accumulator: String): String =
       if (n <= 0) accumulator
       else concatenateString(aString, n - 1,accumulator)
      println(concatenateString("hello", 3, " "))
      }
  }

     */
    /*
    def isPrime(n: Int): Boolean = {
      def isPrimeTail(t: Int, isStillPrime: Boolean): Boolean =
        if (!isStillPrime) false
        else if (t <= 1) true
        else isPrimeTail(t - 1, n % t != 0 && isStillPrime)

      isPrimeTail(n / 2, true)
    }
    println(isPrime(2))

 */
    /*
    def fibnocci(n: Int): Int = {
      def fibnocciNo(t: Int,last:Int,next:Int): Int =
        if (t >=n) last
        else (fibnocciNo(t+1,last+next,last))
      if(n<=2)1
      else fibnocciNo(2,1,1)
    }
    println(fibnocci(8))
  }
*/
  }
}
