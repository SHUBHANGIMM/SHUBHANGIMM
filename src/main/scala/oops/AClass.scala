package oops

object AClass {
  def main(args: Array[String]): Unit = {
    abstract class book {
      def pages: Unit
    }
    val readBook: book = new book {
      override def pages: Unit = println("there is total 240 pages")
    }
    println(readBook.getClass)

    class Person(name: String) {
      def lesson: Unit = println(s"hii book name is $name")
    }

    val wakeUP = new Person("lesson") {
      override def lesson: Unit = println("hello")
    }
  }
}
