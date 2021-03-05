package striner

object StudyMatchCase {

  def main(args: Array[String]): Unit = {

    matchCase(1)
    matchCase(2)
    matchCase(3)
    matchCase("2")
  }

  def matchCase(x: Any): Unit = x match {
    case 1 => println("1")
    case 2 => println("2")
    case y: Int => println("Int2 :: " + (y == x)) // 把匹配项赋给变量y
    case _ => println("many")
  }
}

