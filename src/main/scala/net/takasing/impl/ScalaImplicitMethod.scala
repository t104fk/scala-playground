package net.takasing.impl

import java.util.Date

/**
 * @author takasing
 */
object ScalaImplicitMethod extends App {
  implicit def int2String(num:Int):String = {
    println("convert Int to String.")
    num.toString
  }
  implicit def date2String(date:Date):String = {
    // can import in method scope
    import org.apache.commons.lang3.time.FastDateFormat
    println("convert Date to String.")
    val fdf = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss")
    fdf.format(date)
  }
  // If this method exists, compilation error because of anbiguous
//  implicit def dateToString(date:Date):String = {
//    import org.apache.commons.lang3.time.FastDateFormat
//    println("convert Date to String.")
//    val fdf = FastDateFormat.getInstance("yyyy/MM/dd")
//    fdf.format(date)
//  }
  // if #intToString doesn't exist, compilation error.
  // "Expression of type Int doesn't confirm to exected type String"
  val str:String = 10
  val strDate:String = new Date
  println(s"str=$str, strDate=$strDate")
}
