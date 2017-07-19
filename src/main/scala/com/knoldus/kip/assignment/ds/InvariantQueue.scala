

class InvariantQueue[T](private val head: List[T], private val tail: List[T]
                       ) {
  override def toString = head.toString
}



class Animal

class Mammal extends Animal

class Birds extends Animal

class Zebra extends Mammal



object InvariantQueue extends App
{
  val M1 = new Mammal()
  val A1 = new Animal()
  val Z1 = new Zebra()

  val M2: InvariantQueue[Mammal] = new InvariantQueue[Mammal](List(new Mammal {}), Nil)




 // val MammalSub: InvariantQueue[Mammal] = Z1 //Doesn't work as Z1 is a subtype and it accepts variant type only
  // val MammalSuper: InvariantQueue[Mammal] = A1 //Doesn't work as A1 is a supertype and it accepts variant type only
  //

}
