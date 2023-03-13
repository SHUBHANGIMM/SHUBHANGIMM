package collection
object map extends App {

  val list = List(1, 2, 3)
  println(list.head)
  println(list.tail)

  //map

  println(list.map(_ + 1))
  println(list.map(_ + "nnn"))

  //filter
  println(list.filter(_ % 2==0))

  //flatmap
  val toPair = (x:Int) => List(x,x+1)
  println(list.flatMap(toPair))

  //print all combination between 2 lists
  val numbers= List(1,2,3,4)
  val char=List('a','b','c','d')

  val combinations =numbers.flatMap(n=>char.map(c =>"" +c+n))
  println(combinations)

  //foreach
  list.foreach(println)

  //for-comprehensions
  val forCombination=for {
    n <- numbers
    c <- char
  } yield ""+c+n+"-"
  println(forCombination)

  for{
    n <- numbers
  } println(n)

  //syntax overload
  list.map(x=>
    x*2
  )
}