package net.takasing

import org.slf4j.LoggerFactory

/**
 * @author takasing
 */
object FizzBuzz extends App {
  val logger = LoggerFactory.getLogger(this getClass)
  def logging(m : String): Unit = {
    logger info m
  }
  def fizzBuzz(x : Int) : Unit = {
    if (x > 100) return
    (1 to x) foreach ({ i =>
      print(i)
      print(" ")
      if (i % 3 == 0) print("Fizz ")
      if (i % 5 == 0) print("Buzz ")
      println
    })
  }
//  fizzBuzz(30)
  /**
   * http://yuroyoro.hatenablog.com/entry/20100317/1268819400
   * @param x
   */
  def yuroyoro(x : Int) = {
    1 to x
  } map {
    case x if x % 15 == 0 => s"$x Fizz Buzz"
    case x if x % 3 == 0 => s"$x Fizz"
    case x if x % 5 == 0 => s"$x Buzz"
    case x => x toString
  } foreach { e =>
    println(e)
  }
  yuroyoro(30)
}
