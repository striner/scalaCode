package striner

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

object StudyIO {

  def main(args: Array[String]): Unit = {
    val filePath = "F:\\scala\\test.txt"
    println("请输入一个字符串:")
    val a = StdIn.readLine()
    println("字符串输入成功，输入的是：" + a)
    val writer = new PrintWriter(new File(filePath))
    writer.write(a)
    writer.close()
    println("字符串已写入文档")
    println("读取文档内容如下：")
    Source.fromFile(filePath).foreach{
      print
    }
  }

}
