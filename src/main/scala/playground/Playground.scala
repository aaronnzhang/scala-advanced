package playground

import cats.Monoid
import cats.implicits.toFoldableOps
import cats.kernel.Semigroup

object Playground {
  def main(args: Array[String]): Unit = {

    println("Hello World")

    println(Semigroup[Int].combine(1, 2))
    println(Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6)))
    println(Semigroup[Option[Int]].combine(Option(1), Option(2)))
    println(Semigroup[Option[Int]].combine(Option(1), None))

    println(Monoid[Map[String, Int]].combineAll(List(Map("a" -> 1, "b" -> 2), Map("a" -> 3))))
    println(Monoid[Map[String, Int]].combineAll(List()))

    val l = List(1, 2, 3, 4, 5)
    println(l.foldMap(identity))
  }
}
