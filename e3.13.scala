/*

Exercise 3.13
Hard: can you write foldLeft in terms of foldRight? How about the other way
around? Implementing foldRight via foldLeft is useful because it lets us implement
foldRight tail-recursively, which means it works even for large lists without overflowing
the stack.

*/

object Exercise_3_13 {
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
  
  def foldLeft2[A,B](as: List[A], z: B)(f: (B,A) => B): B = {
    foldRight(as, (b:B) => b)((a,g) => b => g(f(b,a)))(z)
  }
  
  def foldRight2[A,B](as: List[A], z: B)(f: (B,A) => B): B = {
    foldLeft(as, (b:B) => b)((g,b) => a => g(f(a,b)))(z)
  }
  
  
}