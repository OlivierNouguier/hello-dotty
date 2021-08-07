case class MyList[+A](a: A*) {
  def ++[A1 >: A](that: MyList[A1]): MyList[A1] = ???
}

class Animal(name: String)

class Dog(name: String) extends Animal(name) {
  override def toString = s"Dog($name)"
}
class Cat(name: String) extends Animal(name) {
  override def toString = s"Cat($name)"
}

val medor = new Dog("medor")
val fefix = new Cat("felix")

val dogList: MyList[Dog] = MyList(medor)
