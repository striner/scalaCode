package striner

object StudyIfLoop {

  def main(args: Array[String]): Unit = {

    // 1. for 循环
    for (a <- 1 to 10) println(a)
    for (a <- 1 until 10) println(a) // until不包含10

    // 2. for 循环集合
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numList2 = List(11, 21, 31, 41, 51, 61, 71, 81, 91)
    for (a <- numList) println(a)
    for (a <- numList; b <- numList2) {  // 类似于嵌套for循环
      println(s"$a ... $b")
    }

    // 3. range
    for( i <- Range(1,100)) println(s"i = $i"); //类似于 until
    for(i <- Range(1,10,2)) println(s"i = $i") //增加步长为2，不包含10

    // 4. yield 关键字
    val y1 = for (a <- 1 to 10) yield a // 返回数据存储
    println(y1)


    // 5. for 循环过滤
    for (a <- 1 to 10 if a % 2 == 0; if a != 5) println(a)

    // 6. foreach
    numList2.foreach(println)
  }
}
