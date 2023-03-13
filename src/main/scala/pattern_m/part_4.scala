package pattern_m

object part_4 extends App {
  try {

  } catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "something else"
  }
  val list = List(1, 2, 3, 4)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield 10 * x

  //generators are based on pattern matching

  val tuples = List((1, 2), (3, 4))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first * second

  //case classes,:: operators,...

  val tuple = (1, 2, 3)
  val (a, b, c) = tuple
  println(b)

  //multiple value definations based on pattern matching
  //all the power

  val head :: tail = list
  println(head)
  println(tail)

  val mappedList = list.map {
    case v if v % 2 == 0 => v + "is even"
    case 1 => "the one"
    case _ => "something else"
  }
  val mappedList1 = list.map {
    case v if v % 2 == 0 => v + "is even"
    case 1 => "the one"
    case _ => "something else"
  }
  println(mappedList)
}