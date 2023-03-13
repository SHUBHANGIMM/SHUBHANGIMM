package oops

import java.io.Writer
/*
class Writer(firstName:String,LastName:String,val year:Int){
  def fullName() {
    println(firstName+""+LastName)
  }
}

class Novel(name:String,author:Writer, year: Int){
    def authorAge=year-author.year;
    def isWrittenBy(author:Writer) =this.author;
    def copy(newYear:Int):Novel=new Novel(name,author,newYear)
}
*/
class ThisEx(var id:Int,var name:String){
  def Ex1(id:Int,name:String) {
    this.id=id;
    this.name=name;
  }
  def show(): Unit = {
    println(id+" "+name)
  }

}
object part2oops {
  def main(args: Array[String]): Unit = {
    var t=new ThisEx(101,"martin")
    t.show()
    /*
   val author=new Writer("john","sons",1222)
   val novel= new Novel("gcd",author,1812)
   println(novel.authorAge)
    println(novel.isWrittenBy(author))
     */
  }
}
