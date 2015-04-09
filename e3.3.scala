/*

Exercise 3.3
Using the same idea, implementing the function setHead for replacing the first element
of a list with any different value.

*/

object Exercise_3_3 {
  def setHead[T](l: List[T], h: T) = { l match {
    case Nil => throw new NoSuchElementException
    case x::Nil => h::Nil
    case x::xs => h::xs
  }}
}