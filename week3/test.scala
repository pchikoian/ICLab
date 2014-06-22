import File.countFile

object Test {
  def main(args: Array[String]) {
    for (arg <- args) {
      println(arg)
      countFile(arg)
    }
  }
}
