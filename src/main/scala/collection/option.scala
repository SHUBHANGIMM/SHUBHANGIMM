package collection

import scala.util.Random

object option {
  def main(args: Array[String]): Unit = {
    val myFirst: Option[Int] = Some(4)
    val noOption: Option[Int] = None
    println(myFirst)

    //unsafe APIs
    def unsafeMethod(): String = null

    // val result =Some(null) wrong
    val result = Option(unsafeMethod())
    println(result)

    //chained methods
    def backupMethod(): String = "a valid result"

    val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

    //design unsafe Apis
    def betterUnsafeMethod(): Option[String] = None

    def betterBackupMethod(): Option[String] = Some("a valid result")

    val betterChainResult = betterUnsafeMethod() orElse betterBackupMethod()

    //functions on options
    println(myFirst.isEmpty)
    println(myFirst.get)

    //map,flatMap,filter
    println(myFirst.map(_ * 2))
    println(myFirst.filter(x => x > 10))
    println(myFirst.flatMap(x => Option(x * 10)))

    //for-comprehensions

    val config: Map[String, String] = Map {
      "host" -> "176.43.77.88"
      "port" -> "80"
    }
    class Connection {
      def connect = "connected"
    }

    object Connection {
      val random = new Random(System.nanoTime())

      def apply(host: String, port: String): Option[Connection] =
        if (random.nextBoolean()) Some(new Connection)
        else None
    }
    //try to establish connection, if so-print the connect method
    val host =config.get("host")
    val port=config.get("port")
    val connection =host.flatMap(h=>port.flatMap(p=>Connection.apply(h,p)))
    val connectionStatus =connection.map(c=>c.connect)

    println(connectionStatus)
    //connectionStatus.foreach(println)

    //cHAINED calls
    config.get("host")
      .flatMap(host=>config.get("port")
          .flatMap(port=>Connection(host,port)))
            .map(connection=>connection.connect)
      .foreach(println)
  }
}
