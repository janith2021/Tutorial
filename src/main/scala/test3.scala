import scala.io.StdIn._
object test3 {
def main(args: Array[String]): Unit ={

  println("Please Enter Your Number= ")
  var p= readInt()
  println("Total= "+addNumber(p))
}

  def addNumber(a: Int): Int = {
    if (a == 1) {
      return 1
    }
    else{
      a+addNumber(a-1)
    }
  }
}
