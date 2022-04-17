import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class BiographyGUI {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        List<Book> bookList = new ArrayList<>();
        String bookInfo = "";

        String firstName = JOptionPane.showInputDialog(Questions.askFirstName);
        String lastName = JOptionPane.showInputDialog(Questions.askLastName);
        String country = JOptionPane.showInputDialog(Questions.askCountry);
        String isAlive = JOptionPane.showInputDialog(Questions.askIfAlive);
        String ageQuestion = "";
        isAlive = (isAlive.toUpperCase().startsWith("Y")) ? "true" : "false";
        int age = 0;
        if (isAlive.equals("true")) {
            ageQuestion = JOptionPane.showInputDialog(Questions.askAuthorsAge);
            age = Integer.parseInt(ageQuestion);
        }
        Author author = new Author(firstName, lastName, country, isAlive, age);
        do {
            bookInfo = JOptionPane.showInputDialog(Questions.askToEnterBook);

            if (bookInfo.toUpperCase().startsWith("Y")) {
                String name = JOptionPane.showInputDialog(Questions.askBookName);
                String genre = JOptionPane.showInputDialog(Questions.askBookGenre);
                String pages = JOptionPane.showInputDialog(Questions.askHowManyPages);

                Book books = new Book(name, genre, pages);
                bookList.add(books);
            }

        } while (bookInfo.toUpperCase().startsWith("Y"));

        JOptionPane.showMessageDialog(null,"Author's information = "+author);
        if (!bookList.isEmpty()) JOptionPane.showMessageDialog(null,"Author's books are as listed below:");

        for (Book book : bookList) {
            JOptionPane.showMessageDialog(null,book);
        }





    }
}
