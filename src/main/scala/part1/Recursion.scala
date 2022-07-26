package part1

import scala.annotation.tailrec

object Recursion extends App {

  def factorial (n: Int): Int = {
    if (n <= 1) 1
    else  {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }

  }
  println(factorial(10))

  def anotherFactorial (n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x < 1) accumulator
      else factorialHelper(x-1, x * accumulator)
      // TAIL RECURSION = use recursive call as the LAST expression


    }
    factorialHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
   = factorialHelper(9, 10 * 1)
   = factorialHelper(8, 9 * 10 * 1)
   = factorialHelper(7, 8 * 9 * 10 * 1)
   = ...
   = factorialHelper(2, 3 * 4 * ... * 10 * 1)
   = factorialHelper(1, 2 * 3 * 4 * ... * 10 * 1) -> == factorial(10)
     -> returns accumulator when x == 0
   */

  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  // 1. String concatenation n times using tail recursion
  @tailrec
  def concatString(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatString(aString, n - 1, aString + accumulator)
  }

  // 2. isPrime function using tail recursion
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailrec(n / 2, true)
  }
  // 3. Fibonacci function using tail recursion
  def fib(n: Int) : Int = {
    @tailrec
    def fibTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibTailrec(i + 1, last + nextToLast,  last)
    }
    if (n <= 2) 1
    else fibTailrec(2, 1, 1)
  }
}
