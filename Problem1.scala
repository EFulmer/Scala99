package Scala99

object Problem1 {
  def last1[A](l: List[A]): A = 
	l match {
	  case li :: Nil => li
	  case l :: ll   => last1(ll.tail)
	}
  
  def last2[A](l: List[A]): A = l.last
}
