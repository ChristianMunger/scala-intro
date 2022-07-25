package part2oop

object InheritanceAndTraits extends App {

  // single class inheritance
  class Animal {
    def eat = println("nomnom")
  }
  class Cat extends Animal
  val cat = new Cat
  cat.eat






}
