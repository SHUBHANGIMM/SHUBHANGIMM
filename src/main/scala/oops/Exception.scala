package oops

class Exception {
def divide(a:Int,b:Int)= {
 try {
   a/b
 }
  catch {
    case e:ArithmeticException=>println(e)
    case ex:Exception=>println(ex)
  }
  finally{
    println("final block exectues")
  }
}

}

object Main{
  def main(args: Array[String]): Unit = {
    //var e= Array.ofDim(Int.MaxValue)
    var e=new Exception()
    e.divide(100,0)
  }
}