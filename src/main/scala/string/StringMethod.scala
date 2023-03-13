package string

class StringEx{
  var s1="hhhdd"+ s2
  var s2="jjj"
  var s3="hhh"

  def show(): Unit = {
    println(s1.equals(s2))
    // if s1>s2 =>+ve no.
    // if s1=s2 =>0
    // if s1<s2 =>-ve no.
    println(s1.compareTo(s2))
    println(s2.compareTo(s3))
    println(s1)
    //in scala we can concatenate string using +operator or concat
    // to get a index we use substring()
    println(s1.substring(0,2))

    // in scala string we 3 interpolation method s,f,raw.
    // s method of string interpolation allow u to pass variable in string object
    println(s"this is $s1")
    // the f method is used to format your string output
    println(f"this is $s2%s")
  }

}

object StringMethod {
  def main(args: Array[String]): Unit = {
    var s=new StringEx()
    s.show()
  }
}
