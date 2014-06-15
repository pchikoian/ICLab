package week2
import scala.util.Random

trait HelloTrait{

	// learn how to use map
	var myData = Map(1->"one", 2->"two", 3->"three", 4->"four", 5->"five")
	def myprint(x:Int){
		println("#" + myData(x));
	}

	// learn how to use for loop and random(how to use a lib)
	def lotteryfun(){
		for(i <- 0 to 5)	
			println("#" + (Random.nextInt(89) + 10) + ", ")				
	}
}
