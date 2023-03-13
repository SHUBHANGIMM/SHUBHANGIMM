package collection

object tuple {
  def main(args: Array[String]): Unit = {
    var tupleValue =(1,2.5,"India")
    println("iterationg values:")
    tupleValue.productIterator.foreach(println)

    println("accesing value")
    println(tupleValue._1)//fetching first value
  }

}
