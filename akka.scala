import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class HelloActor extends Actor with NumberMapping with Lottery {
  def receive = {
    case n:Int	 => println(mapping(n))
    case "lottery" => lotteryGO()
    case _       => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! 6
  helloActor ! 2
  helloActor ! 3
  helloActor ! 4
  helloActor ! 5
  helloActor ! "kevingyc"
  helloActor ! "lottery"
}

