package part2oop

object Objects{

  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY("static")
  object Person { // type + its only instance
    val N_EYES = 2
    def canFly: Boolean = false
    // factory method -> building Persons class given parameters
    def from(mother: Person, father: Person): Person = new Person("Bobby")

  }
  class Person(name: String) {
    // instance-level functionality
  }
  // COMPANIONS -> using class and object as same name
  //            -> all code will be accessed from class or object

  def main(args: Array[String]): Unit = {
    // Scala Applications = Scala object with
    // def main(args: Array[String]): Unit
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = singleton instance
    val mary = Person
    val john = Person
    println(mary == john)  // same instance of object Person

    val newMary = new Person("Mary")
    val newJohn = new Person("John")
    println(newJohn == newMary)// different because instances of class

    val bobby = Person.from(newMary, newJohn)
  }



}
