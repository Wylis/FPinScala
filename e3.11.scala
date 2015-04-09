/*

Exercise 3.11
Write a sum,product, and a function to compute the length of a list using foldLeft

def foldLeft[A,B](as: List[A], z: B)(f: (B,A) => B): B

*/

object Exercise_3_11 {
  @annotation.tailrec
  def foldLeft[A,B](as: List[A], z: B)(f: (B,A) => B): B =
    as match {
      case Nil => z
      case h::t => foldLeft(t, f(z,h))(f)
    }
  
  def sum(ns: List[Int]) = foldLeft(ns,0)(_+_)
  
  def product(ns: List[Double]) = foldLeft(ns,1.0)(_*_)
  
  def length(ns: List[Double]) = foldLeft(ns,0)((x,_) => x+1)
}