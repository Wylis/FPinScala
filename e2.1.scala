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