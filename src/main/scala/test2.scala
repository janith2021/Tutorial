import scala.io.StdIn._
import scala.util.control.Breaks._

object test2 {
def main(args: Array[String]): Unit ={
  println("Enter Your Number= ")
  var p= readInt()
  println(primeSeq(p,2))
}

def GCD(a:Int,b:Int):Int= b match{
  case 0 => a
  case x if x>a => GCD(x,a)
  case _ => GCD(b,a%b)
}

def prime(a:Int,b:Int=2):Boolean= b match{
  case x if x==a => true
  case x if GCD(a,x)>1 => false
  case x => prime(a,x+1)
}
def primeSeq(a:Int,b:Int):Int={
  if(a==b){
    break
  }
  if(prime(b)){
    println(b)
  }

  primeSeq(a,b+1)
}

}
