/*Develop the function of interest. It consumes a deposit amount and produces the actual
amount of interest that the money earns in a year. The bank pays a flat 2% for deposits of up to
Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per year for deposits
of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs. 200000.*/

object Q1 {
  def interest(deposit: Int): Double = deposit match {
    case x if x<=20000  => deposit*0.2
    case x if x<=200000 => deposit*0.4
    case x if x<=2000000 => deposit*0.35
    case x if x>=2000000 => deposit*0.65
  }

  def main(args: Array[String]): Unit = {
    println(interest(3000000))
  }
}
