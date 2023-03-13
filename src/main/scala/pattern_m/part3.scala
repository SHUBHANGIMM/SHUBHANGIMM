package pattern_m

object part3 {
  class part2 extends App{

    //1. constants
    val x:Any="Scala"
    val constants=x match {
      case 1 =>"a number"
      case "Scala" =>"the Scala"
      case true=>"the truth"
      case part2 =>"A singleton object"
    }
    //2. match anything
    // 2.1. wildcard

    val matchAnything=x match {
      case _ =>
    }
    // 2.2 variable
    val matchVariable= x match {
      case something => s"i've found $something"
    }

    //3-tuples
    val aTuple=(1,2)
    val matchATuple =aTuple match {
      case (1,1) =>
      case (something,2)=>s"i have found $something"
    }
    val nestedTuple=(1,(2,3))
    val matchNestedTuple=nestedTuple match {
      case (_,(2,v))=>
    }

    //PMs can be nested!
    //list pattern
    val astandardList=List(1,2,3,55)
    val astandardListMatching =astandardList match {
      case List(1,_,_,_)=> //extractor-advanced
      case List(1,_*)=> //list of arbitrary length
      case 1:: List(_)=>//infix
      case List(1,2,3):+ 42=> //infix
    }
    //type specifiers
    val unknown:Any=2
    val unknownMatch=unknown match {
      case list: List[Int]=> //explicit type specifier
      case _ =>
    }
  }

}
