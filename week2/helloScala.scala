package week2

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class HelloActor extends Actor with HelloTrait{
  def receive = {
    case n:Int => myprint(n)
    case "lottery"    => lotteryfun()
    case _     => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! 1
  helloActor ! 2
  helloActor ! 3
  helloActor ! 4
  helloActor ! 5
  helloActor ! "lottery" 
}
