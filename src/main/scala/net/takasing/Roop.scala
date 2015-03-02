package net.takasing

import org.slf4j.LoggerFactory

/**
 * @author takasing
 */
object Roop extends App {
  val logger = LoggerFactory.getLogger(this getClass)
  def logging(str : String) = {
    logger info str
  }
  def logging(x : Int) = {
    logger info x.toString
  }
//  for (i <- 1 to 5) {
//    logger info("HelloWorld!")
//  }
//  (1 to 5) foreach { _ =>
//    logger info("HelloWorld!")
//  }
//  (1 to 5) foreach (logging)
//    (1 to 5) foreach (i => logging(i))
  (1 to 5) foreach ({ i =>
    if (i % 2 == 0) logging(s"$i is even.")
//    else logging(s"$i is odd.")
      else logging(s"${i * 1} is odd.")
  })
}
