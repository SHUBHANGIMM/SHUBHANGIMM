package playground

object practise {
  def main(args: Array[String]): Unit = {
    val str:String ="hello lets begin start learning"
    println(str.charAt(2))
    println(str.substring(7,11))
    println(str.split("").toList)
    println(str.startsWith("hello"))
    println(str.toLowerCase())
    println(str.length)

    val aNumberS="2"
    val aNumber= aNumberS.toInt
    println(aNumber)

    val name ="david"
    val age =12
    val greeting =s"hello, my name is $name and i am $age years old"
    print(greeting)
  }

}
