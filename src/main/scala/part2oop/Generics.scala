package part2oop

object Generics extends App {
  class MyList[A] {
    // use the type A
  }
  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]


  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // if cat extends animal, does a list of cat extend list of animals
  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ????

  // 2. no = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]


  // 3. Hell, no = CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A) // cage only accepts subtypes of animal
  val cage = new Cage(new Dog)
  /*
   doesn't work
   val Car
   val car = new Cage(new Car)
   */




}
