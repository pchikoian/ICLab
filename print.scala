object print{
  def main(args:Array[String]) {
    for(arg <- args)
	  readFile(arg)
	}

def readFile(path: String) {
  val lines = scala.io.Source.fromFile(path).getLines().toList
  val max = lines.reduceLeft((s1, s2) => if(s1.length > s2.length) s1 else s2)
  println("maxsize: "+ max.size)
     for(line <- lines) {
       val spaceNum = max.length.toString.length - line.length.toString.length
       val space = " " * spaceNum
       println(space + line.length + "|" + line) 
         }
	 }
}	
