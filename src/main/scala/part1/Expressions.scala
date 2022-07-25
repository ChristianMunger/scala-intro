package part1

object Expressions extends App {
  // + - * / & | ^ << >> >>> (right  shift with zero extension)
  val x = 1 + 2 * 4 // Expression
  println(x)

  // == != > >= < <=
  println(3 == 1)

  // ! && ||
  var aVariable = 2
  aVariable += 3


  // Instructions(DO) VS Expressions(VALUE)

  // IF expression -> returns value
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 2)

  // AVOID WHILE LOOPS AND FOR LOOPS
  // EVERYTHING IN SCALA IS AN EXPRESSION
  var i = 0
  while(i<10) {
    println(i)
    i += 1
  }

  // side effects are unit type
  // side effects: println(), whiles, reassigning
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)


  // Code Blocks
  // value of a block is value of last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }


  // 1. Difference between "hello world" vs println("hello world")
          // -> "hello world" is a string
          // -> println("hello world") is a unit

  // 2. What's the value of the following:
  val someValue = {
    2 < 3
  }
  // BOOLEAN

  // 3. What's the value of the following:
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  // INT

}
