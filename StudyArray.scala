package striner

import scala.collection.mutable.ArrayBuffer

object StudyArray {

  def main(args: Array[String]): Unit = {

    val arr1 = new Array[String](3)
    val arr2 = Array("aaa", "bbb", "ccc")

    arr1(0) = "zxc"; arr1(1) = "asd"; arr1(4 / 2) = "qwe"
    arr1.update(2, "ddd")

    // 合并数组
    val arr3 = arr1.concat(arr2)

    println("arr1   -----    "); arr1.foreach(println)
    println("arr2   -----    "); arr2.foreach(d => println(d))
    println("arr3   -----    "); for (a <- arr3) println(a)
    println(" ----- end ----- ")


    // 多维数组
    val myMatrix = Array.ofDim[Int](3, 3, 3, 6)
    for (i <- 0 to 2; j <- 0 to 2; z <- 0 to 2; m <- 0 to 2) {
      myMatrix(i)(j)(z)(m) = j
    }


    // 可变数组
    val arr4 = new ArrayBuffer[String]()
    arr4.addOne("aaa")
    arr4.addOne("bbb")
    arr4.foreach(println)
  }
}
