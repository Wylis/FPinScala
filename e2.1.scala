/*

Exercise 2.1
Write a recursive function to get the n-th Fibonacci number (http://mng.bz/C29s).
The first two Fibonacci numbers are 0 and 1. The n-th number is always the sum of the
previous two - The sequence begins 0, 1, 1, 2, 3, 5. Your definition should use a
local tail-recursive function.

def feb(n: Int): Int

*/

object Exercise_2_1 {
  def fib(n: Long): Long = {
    @annotation.tailrec
    def go(a: Long, b: Long, n: Long):Long = {
      if(n < 1) 0
      else if(n < 2) b
      else go(b, a+b, n-1)
    }
    go(0, 1, n)
  }
}