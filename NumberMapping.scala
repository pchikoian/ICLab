trait NumberMapping{
	val numberMap = Map(1->"one", 2->"two", 3->"three", 4->"four", 5->"five", 
				6->"six", 7->"seven", 8->"eight", 9->"night", 10->"ten")
	def mapping(num: Int):String = {
		numberMap(num)
	}
}
