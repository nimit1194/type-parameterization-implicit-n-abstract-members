

class UpperBoundQueue[-T] (private val head:List[T],private val tail:List[T]){

  def display[U <: T](x: U):String = s"Object is $x"

  def enqueue[U<:T](x:U):UpperBoundQueue[U]= new UpperBoundQueue(head,x :: tail)
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



  val zebraQueue:LowerBoundQueue[Mammal]= new LowerBoundQueue[Mammal](List(M1,M2),Nil)

  println(zebraQueue.display(M1))
  println(zebraQueue.display(A1))// Accepts as A1 is Supertype object & we have set Mammal class as Lowerbound .

  println(zebraQueue.display(new AnyRef)) // Accepts as AnyRef object & we have set Mammal class as Lowerbound .





}