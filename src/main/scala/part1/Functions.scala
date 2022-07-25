package part1

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  // WHEN YOU NEED LOOPS USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // Can use unit type when we don't use computation
  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  }

  // Function with code block
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, - 1)
  }

  // EXERCISES
  // 1. A Greeting function (name, age) = "Hi, my name is $name and I am $age years old
  def naming(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  // 2. factorial function
  def factorial(n: Int): Int = {
    if(n<0) 1
    n * factorial(n - 1)
  }

  // 3. fibonacci function
  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // 4. tests if number is prime
  def isPrime(n: Int)= {
    def isPrimeUntil(t: Int): Boolean = {
      if(t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n / 2)
    }
  }







}
