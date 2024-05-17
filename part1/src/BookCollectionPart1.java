import java.util.*;

public class BookCollectionPart1 {

    public static List<Book> getCollection() {
        // Fill in with your code!
        // At least 10 books with at least 3 authors

        return List.of(); // replace with your own code
    }

    public static void main(String[] args) {
        List<Book> collection = getCollection();
        Scanner in = new Scanner(System.in);

        // Write code to, in a loop, have the user enter a keyword, then print out all books
        // whose title contains the keyword. (Print the book year, title, and author name.)
        // Exit when the user types in a blank.

        // Your code to print out all the books should be written in a functional style, using
        // streams (collection.stream()....) - no loops!
        //   - .filter() to get only books containing the keyword
        //   - .map() to turn the book (and author) into an appropriate string
        //   - .forEach() to print them out

    }
}
