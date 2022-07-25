package part1

object ValuesVariablesTypes extends App{

  // vals are immutable
  // cannot be changed later
  // val types can be inferred
  val x = 42
  val aString: String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aLong: Long = 123123152312312L
  val aFloat: Float = 23.523f
  val aDouble: Double = 3.12
  println(x)
  println(aString)
  println(aBoolean)

  // variables
  // variables can be reassigned
  var aVariable = 3
  aVariable = 42 // be mindful of side effects




}

