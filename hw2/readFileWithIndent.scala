import scala.io.Source

object calLetters {
  def test() = println("test")
  def travel(args: Array[String]) = args.foreach(calLine)
  def calLine (arg: String) = { 
    val lines = Source.fromFile(arg).getLines().toList
    val longest = lines.reduceLeft( (a,b) => if (a.length>b.length) a else b )
    val maxWidth = longest.length.toString.length
    
    for (line <- lines) {
      val numSpaces = maxWidth - line.length.toString.length
      val padding = " " * numSpaces
      println(padding+line.length+" | "+line)
    }
  }
}
