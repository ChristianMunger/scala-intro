package part1

object CBNvsCBC extends App {

  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  // arrow means parameter called by name
  def calledByName(x: => Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  // current system time
  // uses same expression throughout method
  calledByValue(System.nanoTime())
  // evaluates expression individually throughout method
  calledByName(System.nanoTime())

}
