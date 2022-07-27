package part2oop

object AbstractDataTypes extends App {

  // abstract
  // do not supply values for val or method
  // let subclasses do that
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat (animal: Animal): Unit
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType:String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }


  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)









}
