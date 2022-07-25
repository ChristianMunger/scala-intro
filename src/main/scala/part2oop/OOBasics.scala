package part2oop

object OOBasics extends App {
  val person = new Person("christian", 22)
  println(person.age)
  println(person.x)
  person.greet("bob")
  person.greet()
}
// constructor
// class parameters are NOT FIELDS unless given val
class Person(name: String, val age: Int) {
  // body
  val x = 2

  // this refers to instantiation of name, name refers to method name
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading -> same name but different signatures
  //             -> reuses name
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  // this calls primary constructor with 2 parameters so this only has name
  def this(name: String) = this(name, 0)
}

// EXERCISES
// 1. novel and writer class
//      Writer: first name, surname, year
//              - method -> fullname
//      Novel: name, year of release, author
//              - method -> authorAge
//              - method -> isWrttenBy(author)
//              - method -> copy (new year of release = nwe instance of novel)
class Writer(firstName: String, lastName:String, val year: Int) {
  def fullName: String = firstName + " " + lastName
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


// 2. Counter Class
//    - receives an int value
//    - method current count
//    - method to increment/decrement => new Counter
//    - overload increment/decrement to receive an amount
class Counter(val count: Int) {
  // have to return a new instance to modify instance
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

  // overload to accept n as inc/dec
  def inc(n: Int): Counter = {
    if (n<=0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }
  def print = println(count)
}