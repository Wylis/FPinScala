/*

Exercise 2.3
Let's look at another example, currying, which converts a function f of two arguments
into a function of one argument that partially applies f. Here again there's only one
implementation that compiles. Write this implementation.

def curry[A,B,C](f: (A, B) => C): A => (B => C)

*/

object Exercise_2_3 {
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = { a:A => b:B => f(a,b) }
}