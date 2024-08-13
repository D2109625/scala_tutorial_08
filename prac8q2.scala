import scala.io.StdIn

object MultipleChecker {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val input = StdIn.readInt()
    val checker = (x: Int) => x match {
      case x if x % 3 == 0 && x % 5 == 0 => "Multiple of Both Three and Five"
      case x if x % 3 == 0 => "Multiple of Three"
      case x if x % 5 == 0 => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }
    println(checker(input))
  }
}