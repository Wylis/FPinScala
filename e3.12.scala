/*

Exercise 3.12
Write a function that returns the reverse of a list (given List(1,2,3) it returns
List(3,2,1)). See if you can write it using a fold.

*/

object Exercise_3_12 {
  @annotation.tailrec
  def foldLeft[A,B](as: List[A], z: B)(f: (B,A) => B): B =
    as match {
      case Nil => z
      case h::t => foldLeft(t, f(z,h))(f)
    }
  
  def reverse[A](ns: List[A]): List[A] = foldLeft(ns,List():List[A])((b,a) => a::b)
}