package striner

object StudyApplyUnapply {

  // 初始化对象时，除了方法外的代码都会被执行
  println("start -- ")

  def main(args: Array[String]): Unit = {
    // 默认调用apply方法，省去new
    StudyApplyUnapply(1, 1)

    val x = 1
    x match {
      // match-case默认会调用unapply方法
      case StudyApplyUnapply(1) => println("case - unapply")
      case _ => println("case - others")
    }
  }

  // 注入方法
  def apply(a: Int, b: Int): Unit = {
    println("apply -- ")
  }

  def apply(): Unit = println("apply -- ")

  // 提取方法
  def unapply(a: Int): Option[Int] = {
    println("unapply -- " + a)
    Some(a)
  }

  println("end -- ")
}
