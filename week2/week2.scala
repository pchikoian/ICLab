import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.util.Random

trait random {

  def randomInt {
    for (i <- 0 to 6) {
	var random : Int = Random.nextInt(100)
        if (random < 10) random = random*10
        print (random +" ")
    }
  }  
}


class HelloActor extends Actor with random{

  val intMapeng = Map(1 -> "one", 2 -> "two", 3 -> "three", 4->"four", 5->"five")
	
  def receive = {

    case n:Int => println(intMapeng(n))
    
    case "lottery"  => randomInt
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! 2
  helloActor ! "lottery"
 
}

