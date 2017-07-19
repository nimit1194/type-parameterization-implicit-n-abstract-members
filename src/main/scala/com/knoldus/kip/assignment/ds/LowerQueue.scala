

class LowerBoundQueue[+T] (private val head:List[T],private val tail:List[T]){

  def display[U >: T](x: U):String = s"Object is $x"

  def enqueue[U>:T](x:U):LowerBoundQueue[U]= new LowerBoundQueue(head,x :: tail)
}

class Animal

class Mammal extends Animal

class Birds extends Animal

class Zebra extends Mammal

object UpperBoundQueue extends App{


  val M1 = new Mammal()
  val M2 = new Mammal()
  val M3 = new Mammal()
  val A1 = new Animal()
  val Z1 = new Zebra()
  val Z2 = new Zebra()



  val zebraQueue:UpperBoundQueue[Mammal]= new UpperBoundQueue[Mammal](List(M1,M2,Z1),Nil)

  println(zebraQueue.display(M1))
  println(zebraQueue.display(Z1))// Accepts as Z1 is Subtype object & we have set Mammal class as Upperbound .
  println(zebraQueue.display(Z2))

  //println(zebraQueue.display(A1)) /// It doesnt work as A1 is a SuperType Object



}