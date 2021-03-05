package striner

object StudyMap {

  def main(args: Array[String]): Unit = {

    // 不可变map
    var m1 = Map("k1" -> 1, "k2" -> 2)
    m1 += ("I" -> 1)
    m1 += ("J" -> 5)
    m1 += ("K" -> 10)
    m1 += ("L" -> 100)
    println(m1)

    // 可变map
    import scala.collection.immutable.Map
    var m2 = Map("k1" -> 1, "k2" -> 2)
    m2 += ("I" -> 1)
    m2 += ("J" -> 5)
    m2 += ("K" -> 10)
    m2 += ("L" -> 100)
    println(m2)

  }
}
