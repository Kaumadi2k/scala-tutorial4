/*Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input.*/

object Q3 {
  def toUpper(name: String): String={
    return name.toUpperCase
  }
  def toLower(name: String): String={
    return name.toLowerCase
  }
  def formatName(name:String, f:String=>String): String={
    return f(name)
  }

  def main(args: Array[String]): Unit={
    print(formatName("kaumadi", toUpper))
  }
}
