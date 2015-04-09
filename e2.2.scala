/*

Exercise 2.2
Implement isSorted, which checks whether an Array[A] is sorted according to a
given comparison function:

def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean

*/

object Exercise_2_2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if(n > as.length -2) true
      else (ordered(as(n),as(n+1))) && go(n+1)
    }
    go(0)
  }
}