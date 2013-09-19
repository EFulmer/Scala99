package Scala99

object Problem2 {
  
  /*
   * Pattern matching is neat, as always.
   */
  def nextToLast[A](l: List[A]): A = {
	l match {
	  case one :: two :: Nil => one
	  case l :: more => nextToLast(more)
	}
  }
  
  /*
   * 
   */
  def penultimate[A](l: List[A]): A = l(l.length - 2)
}
