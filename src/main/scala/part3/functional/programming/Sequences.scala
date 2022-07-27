package part3.functional.programming

object Sequences extends App {

  // Seq
  val aSequence = Seq(1,3,2,4)
  println(aSequence) // List(1,3,2,4)
  println(aSequence.reverse)
  println(aSequence.apply(2))
  println(aSequence.sorted)
}
