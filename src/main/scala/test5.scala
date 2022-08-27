object test5 {

  def main(args: Array[String]): Unit ={
      println(addition(25))
  }

  def checkEven(a:Int):Boolean= a match{
    case 0 => true
    case 1 => false
    case _ => checkEven(a%2)
  }

  def addition(a:Int,b:Int=1): Int = b match{
    case x if(a<x) => 0
    case x if a==x => 0
    case x if(checkEven(x)) => x+addition(a,x+1)
    case _ => addition(a,b+1)
  }

}
