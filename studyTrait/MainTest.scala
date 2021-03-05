package striner.studyTrait

object MainTest {

  def main(args: Array[String]): Unit = {

    // child
    val child = new Child("child cry") with Person {

      def run: String = "child run"
      override def eat: String = "child eat"
    }
    println(child.run)
    println(child.cry)
    println(child.eat)

    // man
    val man = new Man() {
      override def eat: String = "man eat"
    }
    println(man.run())
    println(man.eat)

    // woman
    println(Woman.run)
    println(Woman.eat)
    println(Woman buy "something")
    println(Woman.buy("something02"))
    println(Woman.buy ("something03"))
  }
}
