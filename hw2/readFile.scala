import scala.io.Source

object calLetters {
  def test() = println("test")
  def travel(args: Array[String]) { args.foreach(calLine) }
  def calLine (arg: String) { Source.fromFile(arg).getLines().foreach(cal) }
  def cal (line: String) { println(line.length + " | "+ line) }
}
