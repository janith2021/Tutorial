object test6 {
  def main(args: Array[String]): Unit ={
    fibonacciseq(10)
  }

  def fibonacci(a:Int):Int= a match{
    case 0 => 0
    case x if x==1 => 1
    case _ => fibonacci(a-1)+fibonacci(a-2)
  }

  def fibonacciseq(a:Int):Unit={
    if(a>0) fibonacciseq(a - 1)
    print(fibonacci(a)+" ")
  }
}
