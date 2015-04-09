/*

Exercise 3.2
Implement the function tail for removing the forst element of a List. Note that the
function takes constant time. What are different choices you could make in your
implementation if the List is Nil? We'll return to this question in the next chapter.

*/

object Exercise_3_2 {
  def tail(l: List[Any]) = { l match {
    case Nil => throw new NoSuchElementException
    case x::Nil => throw new NoSuchElementException
    case x::xs => xs
  }}
}