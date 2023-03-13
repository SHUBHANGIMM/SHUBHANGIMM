package Functions

object AnnonymousF{
  def main(args: Array[String]): Unit = {
    /*
    anonymus function with parameter
    var my1=(str1:String,str2:String)=>str1+str2
    var my2=(_:String)+(_:String)

    println(my1("g","f"))
    println(my2("1","dd"))
     */
    // anonymus function without parameter
    var my3=()=>{"welcome!!"}
    println(my3())
    //function as a parameter
    def my4(fun:(String,String)=>String)={
      fun("dog","cat")
    }
    val f1=my4((str1:String,str2:String)=> str1+str2)
    val f2=my4(_+_)
    println(f1)
    println(f1)


  }

}
