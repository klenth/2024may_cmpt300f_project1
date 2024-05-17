// Scala uses _ instead of * in imports
import java.util._

object BookCollectionPart2 {

  // Fill this method in with the Scala equivalent of your Java code
  // (write it yourself, don't just paste it from Java - it's good practice!)
  def getCollection(): Array[Book] =
    Array() // replace this with your own code

  def main(args: Array[String]): Unit =
    ()
  // Do the Scala equivalent of the Java code you wrote in part 1:
  // Write code to, in a loop, have the user enter a keyword, then print out all books
  // whose title contains the keyword. (Print the book year, title, and author name.)
  // Exit when the user types in a blank.
  
  // Use "val" (not "var") whenever possible. You can create a Scanner object in just the same
  // way you do in Java (except that in Scala you don't need to write "new").

  // Your code to print out all the books should be written in a functional style - no loops!
  //   - .filter() to get only books containing the keyword
  //   - .map() to turn the book (and author) into an appropriate string
  //   - .foreach() to print them out

}
