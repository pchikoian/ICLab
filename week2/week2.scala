import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props


class HelloActor extends Actor {
  def receive = {
    case "2" => println("two")
    case "lottery"  => println("34" + "56")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "2"
  helloActor ! "lottery"
 
}

