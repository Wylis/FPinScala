/*

Exercise 3.9
Compute the length of a List using foldRight.

def length[A](as: List[A]): Int

*/

object Exercise_3_9 {
  def foldRight[A,B](as: List[A], z: B)(f: (A,B) => B): B =
    as match {
      case Nil => z
      case h::t => f(h, foldRight(t, z)(f))
    }

  def length[A](as: List[A]): Int = foldRight(as,0)((_,x)=> x+1)
}