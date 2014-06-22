object Reki {
  def main(args: Array[String]) {
    val count = new Countfile
    for (arg <- args) {
      println(arg)
      count.count(arg)
    }
  }
}
