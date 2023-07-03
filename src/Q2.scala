/*Write a program in PatternMatching, takes the integer input from the command line. Based
on the input, write a code using match to print Negative/Zero is input when input is less than or
equal to 0.Print Even number is given when input is even, and print Odd number is given when
input is odd.*/

object Q2 {
  def patternMatching(num: Int): String = num match{
    case x if num<=0 => "Negative/Zero is input."
    case x if num%2==0 => "Input is even."
    case x if num%2!=0 => "Input is odd."
  }

  def main(args: Array[String]): Unit={
    print("enter the number: ")
    var number = scala.io.StdIn.readLine()
    println(patternMatching(number.toInt))
  }
}
