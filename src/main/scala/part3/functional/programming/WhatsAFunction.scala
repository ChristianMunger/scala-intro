package part3.functional.programming

object WhatsAFunction extends App {

  // use and work with functions as first class elements
  // problem: oop
  def doubler = new MyFunction[Int, Int] {
    override  def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

  // function types = Function[A,B]
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String) : Int = string.toInt
  }
  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int,b: Int) = a + b
  }


  // function types Function2[A, B, R] === (A,B) => R
  // ALL SCALA FUNCTIONS ARE OBJECTS
  // 1. A function that concats two strings
  // 2. define a function which takes an int and returns another
  //    function that takes an int and returns an int
  //      - Type of function?
  //      - how to do it?


  def concatenator: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String) : String = a + b
  }
  println(concatenator("hello", "Christian"))

  // Function1[Int,Function1[Int, Int]]
  val superAdder: Function1[Int,Function1[Int, Int]] = new Function1[Int,Function1[Int, Int]] {
    override def apply(x:Int) : Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int) : Int = x + y
    }
  }

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // equivalent -> curried function

}



// BEFORE
class Action[A,B] {
  def execute(element: A): B = ???
}

// NOW
trait MyFunction[A,B] {
  def apply(element: A) : B
}


