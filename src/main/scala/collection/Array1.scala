package collection

class Array1 {
  var arr =Array(1,2,3,4,5)
  arr.foreach((element:Int)=>println(element))
}

object arrayEx{
  def main(args: Array[String]): Unit = {
    var a= new Array1()
  }
}
