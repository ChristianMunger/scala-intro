package part1

object StringOperations extends App {

  val str: String = "hello, my name is christian"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))
  println(str.replace("hello", "Hello"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  // Scala Specific
  // s-interpolator
  val name = "dave"
  val age = 12
  val greeting = s"hi my name is $name and I will be ${age + 1}"

  println(greeting)

  // f-interpolator
  // at least 2 chars and 2 decimals precision in example below (%2.2f)
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  // does not escape string
  println(raw"This is a \n newline")
  val escaped = "this is a \n newline"
  println(escaped)


}
