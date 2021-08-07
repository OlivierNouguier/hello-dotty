package variance

trait Animal(name: String)
case class Dog(name: String) extends Animal(name)
case class Cat(name: String) extends Animal(name)

object Baicc {
  val dogList = List(Dog("medor"))
  val catList = List(Cat("felix"))

  val animalList = dogList ++ catList

}
