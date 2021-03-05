package striner

object StudyFunction {

  import java.util.Date

  def main(args: Array[String]): Unit = {

    println("start")

    var i: Int = 9
    i = i + 1


    val j: Int = 0
    val m, n = 100

    val k = "11233"

    val aa = (1, "134")

    val f: Int = (i: Int, j: String) => {
      println(i + " ... " + j)
      i + 10 + j
    }

    // 匿名函数
    val f1: Int = (j: Int) => {
      j + 4
    }


    var f2 = () => 100

    def f13: Int => Int = (x: Int) => x + 1

    println(f13(2))
    println()

    println(i + " " + j)
    println(m, n, k)
    println(aa)

    println(method(4))
    println("方法： " + m2())
    println("函数： " + f1(10) + 1)
    println("函数放到方法中： " + m2(f1(2)))
    println("方法放到函数中： " + f1(m2))
    println("方法放到方法中： " + m2(m2))
    println("函数放到函数中： " + f1(f1(2)))

    // 偏应用函数
    val x: String = "1"
    val val2 = m22(x, _: String)
    val val22 = f(i, _: String)

    println(val2("2"))
    println(val22("100"))

    val date = new Date
    val logWithDateBound = log(date, _: String)

    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)
    logWithDateBound("message3")

    m3("111", "222", "333")
    m3()

    println()
    m4(2)
    m4(m2(2))
    m42(2)
    m42(m2(2))

    // 指定函数参数名
    println("==== 指定函数参数名 ====")
    m22(y = "1", x = "2")
    m22("4", "3")

    // 高阶函数
    println("==== 高阶函数 ====")
    apply(layout, 10)

    // 函数柯里化
    println("==== 函数柯里化 ====")
    val result1 = add3(1)(1)
    val result21 = add2(1)
    val result22 = result21(1) // result21的值是一个匿名函数，(b: Int)=>1+b
    println(result1)
    println(result22)

    println("==== _占位符 ====")
    println(m5(1, 2))
    println(m52(1, 2))
    println(m53(1, 2))
    println(m54(2, 3))
  }

  def method(i: Int = 10): Int = i + 3

  def m2(f: Int): Int =  f + 100

  def m2() = 100

  def m22(x: String, y: String): Unit = {
    println(x + " -- " + y)
  }

  def log(date: Date, message: String): Unit = {
    println(date + "----" + message)
  }


  // 可变参数
  def m3(args: String*): Unit = {

    var i: Int = 0
    i += 1

    for (arg <- args) {
      println(i + " ::: " + arg)
    }
  }

  def m31(a: Any*): Unit = {

  }

  // 传名调用
  def m4(i: => Int): Unit = {

    println("传名调用 start -- ")
    println("参数：" + i)
    i
  }

  // 传值调用
  def m42(i: Int): Unit = {
    println("传值调用 start -- ")
    println("参数： " + i)
    i
  }

  // 高阶函数
  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int): Unit = {
    println(f(v))
    println(layout(v))
  }

  def layout[A](x: A): String = "[--" + x.toString + "--]"

  // 函数科里化
  def add1(a: Int, b: Int): Int = a + b

  def add2(a: Int): Int => Int = (b: Int) => a + b

  def add3(a: Int)(b: Int): Int = a + b // 柯里化 = 调用两个函数（非柯里化函数），第一个函数返回一个以第二个参数为参数的函数

  // 闭包
  var temp = 0

  def tempMethod(a: Int): Int = a + temp

  // 占位符
  val m5: (Int, Int) => Int = (_: Int) + (_: Int)

  def m52: (Int, Int) => Int = (_: Int) + (_: Int) // 无参方法可以省略括号

  def m53(a: Int, b: Int): Int = m5(a, b)

  val m54 = m53 _

}

