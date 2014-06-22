import CountFile.countAndPrint

object CountMain{
	def main(args: Array[String]){
		if(args.length > 0){
			args.foreach((a) => {
				println(a)
				countAndPrint(a)
			})
		}
	}
}
