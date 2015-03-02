package net.takasing.impl

/**
 * @author takasing
 */
object ScalaImplicitParameter extends App {
  trait FlipFlapper[T] {
    def doFlipFlap(x:T):T
  }
  implicit object IntFlipFlapper extends FlipFlapper[Int] {
    override def doFlipFlap(x: Int): Int = - x
  }
  implicit object StringFlipFlapper extends FlipFlapper[String] {
    override def doFlipFlap(x: String): String = x.reverse
  }
  implicit object BooleanFlipFlapper extends FlipFlapper[Boolean] {
    override def doFlipFlap(x: Boolean): Boolean = ! x
  }
  def flipFlap[T](x:T)(implicit flipFlapper: FlipFlapper[T]) = flipFlapper.doFlipFlap(x)

  println(flipFlap(1))
  println(flipFlap("hello"))
  println(flipFlap(true))
  // could not find implicit value for parameter flipFlapper
//  println(flipFlap(new Date()))
}
