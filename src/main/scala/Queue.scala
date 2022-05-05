class Queue[A] {

  def enqueue (queue : List[A] , element : A) : List[A] =
  {
      val newQueue =  queue ::: List(element)
      newQueue
    }

  def dequeue(queue : List[A] ) : List[A] = {
    queue match {
      case Nil => throw new NoSuchElementException()
      case _ => val newQueue = queue.tail
        newQueue
    }
  }

  def isEmpty (queue : List[A] ): Boolean =
  {
    queue match {
      case Nil => true
      case _ => false
    }
  }

}
