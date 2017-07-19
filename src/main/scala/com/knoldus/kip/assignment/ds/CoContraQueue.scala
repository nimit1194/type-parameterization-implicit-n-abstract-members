
class Animal

class Mammal extends Animal

class Birds extends Animal

class Zebra extends Mammal

class SmallZebra extends Zebra


class CoContraQueue[-S, +T] {
  def write(x: S): T = {
    x match {
      case res: T => res

    }
  }

}



object CoContraQueue extends App {



  val coContra = new CoContraQueue[Mammal, Zebra] {}

  val A1: Animal = new Animal()
  val M1: Mammal = new Mammal()
  val Z1: Zebra = new Zebra()
  val Zz1: SmallZebra = new SmallZebra()

  //println(coContra.write(A1))// It wont work as Animal is a super Type and not in the bound range
  println(coContra.write(M1))
  println(coContra.write(Z1))
  //println(coContra.write(Zz1)) // It wont work as SmallZebra is a Sub Type and not in the bound range


}