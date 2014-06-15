import scala.util.Random

trait Lottery{
	def lotteryGO() = {
		for(i <- 1 to 6){
        	        println(Random.nextInt(89) + 10)
	        }
	}
}
