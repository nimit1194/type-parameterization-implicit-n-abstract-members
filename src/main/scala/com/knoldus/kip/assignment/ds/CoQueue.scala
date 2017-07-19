package com.knoldus.kip.assignment.ds

class CoQueue[+T](private val head: List[T], private val tail: List[T])
{
  override def toString:String = head.toString
}

object CoQueue extends App{

  val A1: CoQueue[Animal] = new CoQueue[Animal](List(new Animal {}), Nil)

  val M1: CoQueue[Mammal] = new CoQueue[Mammal](List(new Mammal {}), Nil)

  val Z1: CoQueue[Zebra] = new CoQueue[Zebra](List(new Zebra {}), Nil)


  val AnimalSub: CoQueue[Animal] = M1//Covariance : Works As Animal is a SuperType of Mammal

  val MammalSub: CoQueue[Mammal] = Z1//Covariance : Works As Mammal is a SuperType of Zebra

  //val MammalSuper: CoQueue[Mammal] = A1 // Doesn't Work as Mammal is Subtype of Animal
  //val ZebraSuper1: CoQueue[Zebra] = M1 // Doesn't Work as Zebra is Subtype of Mammal
}



class Animal

class Mammal extends Animal

class Birds extends Animal

class Zebra extends Mammal

