package my.test

/**
  * Created by Honda on 2017/11/4.
  */
object OriginalJavaStyle {
  def main(args: Array[String]): Unit = {
    try {
      buyCigarettes(18)
    }
    catch {
      case e: Exception => println(e.toString)
    }
  }

  def buyCigarettes(age: Int) = {
    if (age > 20)
      println("Hi! Enjoy smoking")
    else
      throw new RuntimeException("No smoking")
  }

}
