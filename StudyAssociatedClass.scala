package striner

/**
 * 伴生类
 */
object StudyAssociatedClass {

  def apply(a:Int): StudyAssociatedClass = {
    println("StudyAssociatedClass -- object")
    new StudyAssociatedClass(9)
  }

  def method(): Unit = {
    println("StudyAssociatedClass -- object method")
  }
}

class StudyAssociatedClass(a: Int) {

  def apply(): Unit = {
    println("StudyAssociatedClass -- class")
  }

  def method(): Unit = {
    println("StudyAssociatedClass -- class method")
  }
}

object AssociatedTest {
  def main(args: Array[String]): Unit = {
    val s = StudyAssociatedClass(9)
    s.method()
    s()

    StudyAssociatedClass.method()
  }
}

