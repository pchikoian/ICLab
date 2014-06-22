import scala.io.Source

object CountFile {

	def actuallyLength(s:String) = s.replaceAll("[ \\s]","").length

	def printLine(line:String, maxWidth:Int){
		val width = widthOfLength(line)
		val blank = " " * (maxWidth - width)        
		println(blank + actuallyLength(line) + " | " + line)
	}

	def widthOfLength(s:String) = actuallyLength(s).toString.length 
	
	def countAndPrint(filePath:String) {
		val lines = Source.fromFile(filePath).getLines().toList
			
		val maxLengthLine = lines.reduceLeft((a, b)
			=> if( actuallyLength(a) > actuallyLength(b) ) a else b
		)

		val maxWidth = widthOfLength(maxLengthLine)		

		lines.foreach((a) => printLine(a, maxWidth))
	}
}
