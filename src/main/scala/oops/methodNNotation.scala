package oops

object methodNNotation{
  def main(args: Array[String]): Unit = {

    class person(val name: String, favoriteMovie: String, val age: Int = 0) {

      def likes(movie: String): Boolean = movie == favoriteMovie

      def +(person: person): String = s"${this.name} is hanging out with ${person.name}"

      def +(new_person: String): person = new person(s"${name} is meeting new ($new_person)", favoriteMovie)

      def unary_+ : person = new person(name, favoriteMovie, age + 1)

      def learns(things: String) = s"$name learning $things"

      def learnsScala(): String = this learns "scala"

    }

    val mary = new person("Mary", "yjhd")
    //println((mary + "the girl").apply())

    //println((+mary).age)
    println((+mary).age)
    println(mary.learnsScala())

    /*
    val mary=new person("Mary","yjhd")
    println(mary.likes("yjhd"))
    println(mary likes "yjhd")
    val tom =new person("tom","club")
    println(mary+tom)
    */

  }
}
