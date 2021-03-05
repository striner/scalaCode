package striner

object StudyClassScala {

  def main(args: Array[String]): Unit = {

    // scala调用java
    val util = new StudyClassJava()
    util.fun1()
  }

  def printFunObject(s: String): Unit = println("object -- " + s)
}

class StudyClassScala {

  def printFunClass(s: String): Unit = println("class -- " + s)
}
