import scala.io.Source

class File {
  private val fileName = "sample.txt"

  def widthOfLength(s: String) = s.length.toString.length

  def printFileCount(fileName: String) {
    val lines = Source.fromFile(fileName).getLines().toList

    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )

    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length +" | "+ line)
    }
  }
}

object File {
  def countFile(fileName: String) {
    val f = new File
    f.printFileCount(fileName)
  }
}
