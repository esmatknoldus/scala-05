import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QueueTest extends AnyFlatSpec with Matchers {


  "enqueue" should "insert element" in {
    val queueTest=new Queue[Int]
    val result = queueTest.enqueue(List() , 1)
    result shouldEqual List(1)
  }

  "dequeue " should "remove an element" in {
    val queueTest=new Queue[Int]
    val queue = queueTest.enqueue(List(1,2) , 3)
    val result = queueTest.dequeue(queue)
      result shouldEqual List(2,3)
  }

  "queue" should "not remove element" in {
    intercept[NoSuchElementException] {
      val queueTest=new Queue[Int]
      queueTest.dequeue(List())

    }
  }

  "isEmpty" should " return true " in {
    val queueTest=new Queue[Int]
    val queue = List.empty[Int]
    val result = queueTest.isEmpty(queue)
       result shouldEqual true
  }


}
