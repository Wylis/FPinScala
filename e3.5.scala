/*

Exercise 3.5
Implement dropWhile, which removes elements from the List prefix as long as they
match a predicate.

def dropWhile[A](l: List[A], f: A => Boolean): List[A]

*/

object Exercise_3_5 {
  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Nil => Nil	  
      case x::xs =>
	    if(f(x))
	      dropWhile(xs,f)
		else
	      l
    }
  }
}