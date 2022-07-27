package part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }
  // anonymous class
  val funnyAnimal = new Animal {
    override def eat: Unit = println("hahaha")
  }
  println(funnyAnimal.getClass)
}
