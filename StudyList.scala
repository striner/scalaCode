package striner

import scala.collection.mutable.ListBuffer

object StudyList {

  def main(args: Array[String]): Unit = {

    val l1 = List(1, 2, 3, 4, 5)
    val l2 = 1 :: (3 :: (5 :: (9 :: Nil)))

    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println("l1(1): " + l1(1))
    println("l1.head: " + l1.head)
    println("l1.tail: " + l1.tail) // 包含除了第一元素之外的其他元素
    println("dim.tail: " + dim.tail)
    println("l1.isEmpty: " + l1.isEmpty)
    println("l1.drop: " + l1.drop(2)) // 丢弃前2个元素
    println("l1.dropRight: " + l1.dropRight(2))  // 丢弃最后2个元素
    println("l1.take" + l1.take(3)) // 提取前3个元素
    println("l1.takeRight" + l1.takeRight(3))  // 提取后3个元素
    println("l1.max: " + l1.max)
    println("l1.min: " + l1.min)
    println("l1.sum: " + l1.sum)

    println("  ---  ")

    val l3 = l1 :+ 9  // l1 + 9
    val l4 = 9 +: l1  // 9 + l1
    val l5 = l1 ::: l2 // l1 + l2
    val l6 = l1.:::(l2) // l2 + l1
    val l7 = l1.concat(l2) // l1 + l2
    val l8 = List.concat(l1, l2) // l1 + l2
    println("l3: " + l3)
    println("l4: " + l4)
    println("l5: " + l5)
    println("l6: " + l6)
    println("l7: " + l7)
    println("l8: " + l8)

    println("  ---  ")

    // List.fill() 创建一个指定重复数量的元素列表
    val l9 = List.fill(8)(3) // 重复数字3 8次
    val l10 = List.fill(2)("123")
    println("l9: " + l9)
    println("l10: " + l10)


    // 可变列表
    val l20 = ListBuffer[Int]()
    l20 += 100 += 300  // 追加元素
    l20 += 200
    l20 ++= l1  // 追加列表
    println("l20: " + l20)
    l20 -= 3   // 删除元素
    println("l20: " + l20)
    l20 --= l1
    println("l20: " + l20)
  }
}
