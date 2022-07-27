package part2oop

object Inheritance extends App {

  // single class inheritance
  class Animal {
    val creatureType = "wild"
    protected def eat = println("nomnom")
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
  }

  }
  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)


  // overriding
  class Dog(override val creatureType: String = "domestic") extends Animal {
    override def eat = {
      super.eat
      println("crunch")
    }
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)


  // type substitution -> (polymorphism)
  // using dog derived from animal type
  val unknownAnimal: Animal = new Dog("K9")

  // super
  // reference method or field from parent class

  // preventing overrides
  // 1 - use final
  // 2 - use final on class
  // 3 - sealed







}
