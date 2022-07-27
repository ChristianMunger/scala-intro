package part3.functional.programming

object HOFsCurries extends App {
  // val crazyFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = ????
  // higher order function

  // function that applies a function n times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  // another way for nTimes
  // nTimesBetter(f,n) = x => f(f(f(f...(x))))
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if ( n <= 0) (x: Int) => x
    else (x:Int) => nTimesBetter(f, n-1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))


  // curried functions
  val superAdder = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)
  println(add3(10)) // 10 + 3


  // functions with multiple param lists
  def curriedFormater(c: String)(x: Double) : String = c.format(x)
  val standardFormat: (Double => String) = curriedFormater("%4.2f")
  val preciseFormat: (Double => String) = curriedFormater("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))


  // EXERCISES
  // Define a Method toCurry
  // toCurry(f: (Int, Int) => Int) => (Int => Int => Int)
  // fromCurry(f: (Int => Int => Int)) => (Int, Int) => Int
  def toCurry(f: (Int, Int) => Int): (Int => Int => Int) =
    x => y => f(x,y)

  def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int =
    (x,y) => f(x)(y)

  // compose(f, g) => x => f(g(x))
  // andThen(f, g) => x => g(f(x))
  def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))

  def andThen(f: Int => Int, g: Int => Int): Int => Int =
    x => g(f(x))

}
