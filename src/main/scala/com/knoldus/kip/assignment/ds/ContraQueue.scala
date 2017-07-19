package com.knoldus.kip.assignment.ds

class ContraQueue[-T](private val head: List[T], private val tail: List[T])
{
  override def toString:String = head.toString
}

object ContraQueue extends App{

  val A1: ContraQueue[Animal] = new ContraQueue[Animal](List(new Animal {}), Nil)

  val M1: ContraQueue[Mammal] = new ContraQueue[Mammal](List(new Mammal {}), Nil)

  val Z1: ContraQueue[Zebra] = new ContraQueue[Zebra](List(new Zebra {}), Nil)




  val MammalSuper: ContraQueue[Mammal] = A1//Contravariance: Works As Mammal is a SubType of Animal

  val ZebraSuper:ContraQueue[Zebra] = M1// Contravariance: Works As Zebra is a SubType of Mammal

  //val AnimalSub: CoContraQueue[Animal] = M1// Doesn't Works As Animal is a SuperType of Mammal

  //val MammalSub: CoContraQueue[Mammal] = Z1// Doesn't Works As Mammal is a SuperType of Zebra

}




