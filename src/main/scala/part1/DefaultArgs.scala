package part1

object DefaultArgs extends App {
  def trFactorial(n: Int, acc: Int = 1): Int = {
    if(n<=1) acc
    else trFactorial(n-1, n * acc)
  }

  val fact10 = trFactorial(10, 1)

  // passing defaults can lead to problems
  def savePict(format: String = "jpg", width: Int, height: Int): Unit =
    println("saving picture")

  // compiler thinks 800 is first parameter -> format
  // savePict(800, 600)
  /*
  1. pass in every leading argument
  2. name the arguments savePict(width = 800, height = 600)
        -> can rearrange order of parameter input
   */

}
