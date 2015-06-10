/*

Exercise 3.14
Implement append in terms of either foldLeft or foldRight.

*/

object Exercise_3_14 {
  @annotation.tailrec
  def foldLeft[A,B](as: List[A], z: B)(f: (B,A) => B): B =
    as match {
      case Nil => z
      case h::t => foldLeft(t, f(z,h))(f)
    }

  def foldRight[A,B](as: List[A], z: B)(f: (A,B) => B): B =
    as match {
      case Nil => z
      case h::t => f(h, foldRight(t, z)(f))
    }

  def appendFromRight[A](a1: List[A], a2: List[A]): List[A] = {
    foldRight(a1, a2)((acc,cur) => acc+:cur)
  }
  def appendFromLeft[A](a1: List[A], a2: List[A]): List[A] = {
    foldLeft(a2, a1)((acc,cur) => acc:+cur)
  }
}
