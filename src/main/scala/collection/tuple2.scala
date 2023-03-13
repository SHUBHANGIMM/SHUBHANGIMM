package collection

object tuple2 {
  def main(args: Array[String]): Unit = {
    //maps - Keys->Values
    val aMap:Map[String,Int]=Map()
    val phonebook =Map(("Jim",88),"richie" -> 66).withDefaultValue(-1)
    println(phonebook)

    //map operations
    println(phonebook.contains("Jim"))
    println(phonebook("hellna"))

    //add a pairing
    val newPairing ="Mary"-> 55
    val newPhonebook=phonebook+newPairing
    println(newPhonebook)

    //functional on map
    //map,flatMap,filter

    println(phonebook.map(pair=>pair._1.toLowerCase -> pair._2))

    //filterKeys
    println(phonebook.view.filterKeys(x => x.startsWith("J")).toMap)

    //mapValues

    println(phonebook.view.mapValues(number=>number*10).toMap)

    //conversion to other collection

    println(phonebook.toList)
    println(List(("daniel",909)).toMap)

    val names =List("bob","james","harry","Jack")
    println(names.groupBy(names=>names.charAt(0  )))
  }

}
