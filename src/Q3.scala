/*Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input.*/

object Q3 {
  def toUpper(name: String, startIndex: Int, endIndex:Int): String={
    var modifyName = name
    for(i <- startIndex to endIndex){
      val convertWord = modifyName.charAt(i).toUpper
      modifyName = modifyName.updated(i, convertWord)
    }
    modifyName
  }

  def toLower(name: String, startIndex: Int, endIndex: Int): String = {
    var modifyName = name
    for (i <- startIndex to endIndex) {
      val convertWord = modifyName.charAt(i).toLower
      modifyName = modifyName.updated(i, convertWord)
    }
    modifyName
  }

  def formatName(name: String, startIndex: Int, endIndex: Int, f: (String, Int, Int) => String): String = {
    f(name, startIndex, endIndex)
  }

  def main(args: Array[String]): Unit={
    println(toUpper("Benny", 0,4))
    println(formatName("Niroshan", 0, 1 , toUpper))
    println(formatName("Saman", 0, 0 , toLower))
    println(formatName("Kumara", 5, 5 , toUpper))
  }
}
