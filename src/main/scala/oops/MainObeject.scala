package oops

class add {
  def addition(a: Int, b: Int) {
    var add = a + b
    println("sum=")
  }

  object MainObeject {
    def main(args: Array[String]): Unit = {
      new add().addition(10, 10)
    }
  }
}