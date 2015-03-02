package net.takasing

import org.slf4j.LoggerFactory

/**
 * @author takasing
 */
object HelloWorld extends App {
  val logger = LoggerFactory.getLogger(this.getClass())
  def logging(x : String): Unit = {
    logger.info(x)
  }
  def sumOfInt(n: Int, m: Int): BigInt = {
    var a : BigInt = 0
    for (i <- n to m) a += i
    a
  }
  logging("hello")
  logging("hella")
  logging(sumOfInt(1, 10).toString())
}
