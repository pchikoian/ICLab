package week2

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.util.Random

class HelloActor extends Actor {
  val m = Map( 1 -> "one", 2 -> "two", 3 -> "three" )
  def receive = {
    case "hello"   => println("hello back at you")
    case n:Int     => println(m(n))
    case "lottery" => Seq.fill(6)(genRan).foreach { x => print(x + " ") }
    case _         => println("huh?")
  }

  
  def genRan:Int = {
    var random = 0;
    while(random <= 10)
      random = Random.nextInt(100)

    random
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

