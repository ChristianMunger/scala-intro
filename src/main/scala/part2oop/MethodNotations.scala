package part2oop

object MethodNotations extends App {
  // inside object to not mess with other Person class
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String) : Boolean = movie == favoriteMovie
    def hangoutWith(person: Person) : String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive : Boolean = true
    // def learns(thing : String) = s"$name is learning $thing"
    // def learnsScala() = this learns "Scala"
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"
    def +(person: Person): String = s"${this.name} is hanging out with $name"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  // equivalent, infix notation or operator notation
  // can be used with methods with one input
  println(mary likes "Inception")

  // operator notation
  val tom = new Person("Tom", "Fight Club")
  println(tom hangoutWith mary)
  // or
  println(tom.hangoutWith(mary))

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // unary_prefix only works with a few operators - + ~ !
  println(!mary)
  println(mary.unary_!)


  // apply
  println(mary.apply())
  println(mary()) // equivalent



  //EXERCISES
  // 1. Overload the + operator
  //      mary + "the rockstar" => new Person "Mary (the rockstar)"
  println((mary + "the rockstar").apply())
  // 2. Add an age to the Person class
  //      add a unary + operator => new person with the age + 1
  //       +mary => mary with the age incrementer
  println(+mary.age)

  // 3. Overload the apply method
  //       mary.apply(2) => "Mary watched Inception 2 times
}
