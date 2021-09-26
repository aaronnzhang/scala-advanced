package playground

import cats.kernel.Semigroup

object Playground {
  def main(args: Array[String]): Unit = {

    println("Hello World")

    println(Semigroup[Int].combine(1, 2))
    println(Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6)))
    println(Semigroup[Option[Int]].combine(Option(1), Option(2)))
    println(Semigroup[Option[Int]].combine(Option(1), None))
  }
}
