package Scala99

object Problem4 {
  
  // Pattern matching.
  def len[A](l: List[A]): Int = {
	l match {
	  case Nil => 0
	  case l :: more => 1 + len(more)
	}
  }
  
  // Conditional, recursive.
  def howLong[A](l: List[A]): Int = if (l.isEmpty) 0 else 1 + howLong(l.tail)
  
  // Using the built-in List class method.
  def length[A](l: List[A]): Int = l.length
}
