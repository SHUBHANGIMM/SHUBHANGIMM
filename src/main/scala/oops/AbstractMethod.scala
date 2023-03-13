package oops
/*
    abstract class Student(id:String){
      var b:Int=1
      var c:Int=2
      def run()
    }

     */
    trait dressCode {
  def rules()

  def regulation(): Unit = {
    println("should follow regularly")
  }
}
    class Teacher extends dressCode {
      def rules(): Unit = {
        println("rules are mandatory")
      }
    }

  object AbstractMethod{
    def main(args: Array[String]): Unit = {
      var s = new Teacher()
      s.rules()
      s.regulation()
    }
  }
