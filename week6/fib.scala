object fib {
  def fibonacci(i : Int) : Int = {
    def cal(last : Int, current: Int, num : Int) : Int = {
      if ( num < 2 ) {
        println(current)
        current
      }
      else {
        println(current)
        cal(current, last + current, num - 1)
      }
    }

    if (i == 2 || i == 1 ) 1
    else {
      println(1)
      println(1)
      cal(1, 2, i - 2)
    }
  }

  def main(args: Array[String]) {
    fibonacci(5)
  }

}
