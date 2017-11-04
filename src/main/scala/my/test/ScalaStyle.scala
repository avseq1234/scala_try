package my.test

import scala.util._

/**
  * Created by Honda on 2017/11/4.
  */
object ScalaStyle {
  def main(args: Array[String]): Unit = {
    val result = Try(buyCigarettes(18))
    println( result )
    val finalResult = result match {
      case Success(value) => "buy success"
      case Failure(e) => "buy fail"
    }

    println(finalResult)

    println("======= Use Option ======")
    val result1 = Try(buyCigarettes(18)).toOption
    println(result1)
    val finalResult1 = result1 match {
      case Some(value) => "buy success"
      case None => "buy fail"
    }

    println(finalResult1)

  }

  def buyCigarettes(age: Int): String = {
    if (age > 20) {
      println("Hi! Enjoy smoking")
      "Enjoy Smoking"
    }
    else
      throw new RuntimeException("No smoking")
  }
}
