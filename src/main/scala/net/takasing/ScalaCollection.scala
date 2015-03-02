package net.takasing

/**
 * @author takasing
 */
object ScalaCollection extends App {
  val array = Array("one", "two", "three")
  array.foreach(println)
  println(array.apply(2))
  val list = List(1, 2, 3)
  val list2 = List(1, 2)
  val merged1 = list ::: list2
  merged1.foreach(println)
  println(list + " and " + list2 + " were not mutated.")
  println("Thus, " + merged1 + " is a new list.")
  val list3 = 0 :: list
  println(list3)
  val list4 = 1::2::3::Nil
  println(list4)
  val list5 = list4 ::: List(5)
  println(list5)
  // ::の場合、右側のオブジェクトのメソッドとして実行される
  // -> 一番右側がNilもしくはListでないと"value :: is not a member of Int"となる
//  val list6 = 1::2::Nil::4
  val list6 = 1::2::3::List(4)
  println(list6)
  println(list6.drop(2) + " is dropped list, and origin=" + list6)
  println(list6.dropRight(2) + " is right dropped list, and origin=" + list6)
  println(list6.exists(s => s == 4))
  println(list6.exists(s => s == 5))
  println(list6.filter(s => s > 2))
  // すべての要素に対してtrue/false
  println(list6.forall(s => s > 0))
  println(list6.forall(s => s > 1))
  println(list6.head + " is head of the list.")
  println(list6.init + " is init of the list.")
  println(list6.tail + " is tail of the list.")
  println(list6.last + " is last of the list.")
  println(list6.length)
  println(list6.map(s => s + "yen") + " is mapped list, and org=" + list6)
  println(list6.mkString(", "))
  println(list6.mkString("[", ", ", "]"))
  println(list6.reverse + " is reversed.")
  val list7 = List("one", "two", "three", "four", "five", "six")
  println(list7.sorted + " is sorted.")
  println(list7.sortBy(s => s.length) + " is sorted by length")
  println(list7.sortWith(_.length > _.length))
  println(list7.sortWith(_.length < _.length)) // equal println(list7.sortBy(s => s.length))
}
