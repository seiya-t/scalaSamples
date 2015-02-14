package scala.test

/**
 * square関数を作成し、それを呼び出す
 *
 * @author seiya
 */
object Square {
  def main(args:Array[String]) {
    val square = (x:Int) => x * x
    println(square(4))
  }
}