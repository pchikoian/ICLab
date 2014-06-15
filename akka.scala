import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.util.Random

class HelloActor extends Actor with IntChange{
  def receive = {
    case n:Int => mPrint(n)
    case "lottery" => randomPrint()
    case _       => println("huh?")
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

trait IntChange {
val x = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five")
def mPrint(n:Int){
println(x(n))
}
def randomPrint(){
for(i<-0 to 5){
val r1 = Random.nextInt(89) + 10
println(r1)
}
}
}
