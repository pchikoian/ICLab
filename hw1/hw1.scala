import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.util.Random

trait lottery {
  val seqNum = Seq.fill(6)((Random.nextDouble*100).toInt)
  def result = {
      seqNum.foreach(x => print(x + " "))
    }
}


trait transforms {
  val nums = Map[Int, String](1->"one", 2 ->"two", 3->"three")
  def tran (x: Int): String = nums(x)
}

class HelloActor extends Actor with lottery with transforms {
  def receive = {
    case "hello" => println("hello back at you")
    case "lottery" => result
    case n:Int => println(tran(n))
    case _       => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
  helloActor ! 2
  helloActor ! "lottery"
}

