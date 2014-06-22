import scala.io.Source

class Countfile {
  
  def widthOflength(s: String) = s.length.toString.length

  def count(name: String) = {
  
    val lines = Source.fromFile(name).getLines().toList

    val longestLine = lines.reduceLeft (
    
      (a,b) => if (a.length > b.length) a else b
  
    )

    val maxWidth = widthOflength(longestLine)

    lines.foreach ( line => {

      val numSpaces = maxWidth - widthOflength(line)

      val padding = " " * numSpaces

      println(padding + line.length + " | "+ line)

    })
  }
}
