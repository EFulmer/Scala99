package Scala99

object Problem5 {
  
  // Recursive pattern-matching; you know the @dril.
  def revList[A](l: List[A]): List[A] = {
	l match {
	  case Nil => Nil
	  case l :: Nil => List(l)
	  case l :: more => revList(more) ::: List(l)
	}
  }

  def reverse[A](l: List[A]): List[A] = {
	if (l.isEmpty) Nil 
	else if (l.length == 1) l 
	else reverse(l.tail) ::: List(l.head)
  }
}
