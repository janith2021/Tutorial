object test4 {
    def main(args: Array[String]): Unit ={
      print("Please Enter a Number= ")
      var number= scala.io.StdIn.readInt()
      if(number>=0){
        if(checkEven(number)) println("Your Number is Even") else println("Your Number is odd")
      }else{
        println("You have entered an negative number")
      }
    }

  def checkEven(a: Int):Boolean= a match{
    case 0 => true
    case 1 => false
    case _ => checkEven(a-2)
  }

}
