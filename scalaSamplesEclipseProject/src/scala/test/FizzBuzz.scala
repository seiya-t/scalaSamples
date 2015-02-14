package scala.test

/**
 * FizzBuzz問題
 *
 * @author seiya
 *
 */
object FizzBuzz {
  def main(args: Array[String]) {
    for (n <- 1 to 100) {
      if (n % 3 == 0 && n % 5 == 0) {
        println("FizzBuzz")
      } else if (n % 3 == 0) {
        println("Fizz")
      } else if (n % 5 == 0) {
        println("Buzz")
      } else {
        println(n);
      }
    }
  }
}