package pattern_m

import scala.util.Random

object part1 extends App {
  val random = new Random
  val x = random.nextInt(10)

  val Description = x match {
    case 1 => "the one"
    case 2 => "double or nothing"
    case 3 => "third time is charm"
    case _ => "something"
  }
  println(x)
  println(Description)

  // decompose values

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20)

  val greeting = bob match {
    case Person(n, a) => s"hi,my name is $n and i am $a years old"
    case _ => "i dont know"
  }
  println {
    greeting
  }
  //pm on sealed hierarchies
  sealed class Animal
  case class Dog(breed:String) extends Animal
  case class Parrot(greeting:String) extends Animal

  val animal:Animal=Dog("terra Nova")
  animal match {
    case Dog(somebreed)=>println(s"matched a dog of the $somebreed breed")
  }
  trait Expr
  case class Number(n:Int) extends Expr
  case class Sum(e1:Expr,e2:Expr)extends Expr
  case class Prod(e1:Expr,e2:Expr) extends Expr

  def show(e:Expr):String= e match {
    //case Number(n) =>s"$n"
    case Sum(e1, e2)=>show(e1)+" + " + show(e2)
    case Prod(e1,e2)=>{
      def maybeShowParentheses(exp:Expr)=exp match {
        case Prod(_,_)=>show(exp)
        case Number(_) =>show(exp)
        case _ =>"(" + show(exp)+ ")"
      }
      maybeShowParentheses(e1) + " * "  + maybeShowParentheses(e2)
      //println(show(Sum(Number(2),Number(3))))
      //println(show(Sum(Sum(Number(2),Number(3)),Number(4))))
    }
  }

}
