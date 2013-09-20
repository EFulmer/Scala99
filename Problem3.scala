package Scala99

object Problem3 {

  /*
   * Pattern matching wooooo!
   */
  def kthItem[A](l: List[A], k: Int): A = {
	(l, k) match {
	  case (Nil, k) => throw new java.lang.IndexOutOfBoundsException
	  case (l :: rest, 0) => l
	  case (l :: rest, k) => kthItem(rest, k - 1)
	}
  }
  
  /*
   * Recursive, but with conditionals!
   * I guess this could also be an Option.
   */
  def getKth[A](l: List[A], k: Int): A = { 
	if (l == Nil) throw new java.lang.IndexOutOfBoundsException
	else if (k == 0) l.head
	else getKth(l.tail, k - 1)
  }

  /*
   * The simple way: just using apply().
   */
  def kth[A](l: List[A], k: Int): A = l(k)
}
