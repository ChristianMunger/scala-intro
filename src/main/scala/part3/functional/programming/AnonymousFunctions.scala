package part3.functional.programming

object AnonymousFunctions extends App {

  // easy way
  // anonymous function (LAMBDA)
  val doubler = (x : Int) => x * 2

  // multiple params in lambda
  val adder = (x: Int, y: Int) => x + y

  // no params in lambda
  val justDoSomthing = () => 3

  // must be called with parenthesis
  println(justDoSomthing())

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // More syntactic sugar
  val Incrementer = { (x: Int) => x + 1}
  val Adder: (Int, Int) => Int = _ + _ // equivalent to a + b
  println(Incrementer(3))

  // 1. Rewrite specialAdder from WhatsAFunction to anonymous function
  val specialFunction = {(x: Int) => (y: Int) => x + y}
  println(specialFunction(3)(4))

}
