package part3.functional.programming

object MapFlatmapFilterFor extends App {

  val list = List(1,2,3)
  println(list)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  // flatmap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  // print all combinations between two lists
  // "iterations"
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  // foreach
  list.foreach(println)

  // for-comprehensions
  val forCombinations = for {
    n <- numbers
    c <- chars
    color <- colors
  } yield "" + c + c + "-" + color
  println(forCombinations)

}
