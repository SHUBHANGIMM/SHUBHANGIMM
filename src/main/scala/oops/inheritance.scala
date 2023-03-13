package oops

object inheritance{
  def main(args: Array[String]): Unit = {
    class Employee {
      var salary: Float = 1000
    }
    class programmer extends Employee {
      var bonus: Int = 3000
      println("salary=" + salary)
      println("bonus=" + bonus)
    }

    var c= new programmer()
  }
}
