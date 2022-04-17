import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biography {
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

        Scanner input = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        String bookInfo = "";
        System.out.println(Questions.askFirstName);
        String firstName = input.next();
        System.out.println(Questions.askLastName);
        String lastName = input.next();
        System.out.println(Questions.askCountry);
        String country = input.next();
        System.out.println(Questions.askIfAlive);
        String isAlive = input.next();
        isAlive = (isAlive.toUpperCase().startsWith("Y")) ? "true" : "false";
        int age = 0;
        if (isAlive.equals("true")) {
            System.out.println(Questions.askAuthorsAge);
            age = input.nextInt();
        }
        Author author = new Author(firstName, lastName, country, isAlive, age);
        do {
            System.out.println(Questions.askToEnterBook);
            bookInfo = input.next();
            input.nextLine();

            if (bookInfo.toUpperCase().startsWith("Y")) {

                System.out.println(Questions.askBookName);
                String name = input.nextLine();

                System.out.println(Questions.askBookGenre);
                String genre = input.next();

                System.out.println(Questions.askHowManyPages);
                String pages = input.next();

                Book books = new Book(name, genre, pages);
                bookList.add(books);
            }
        } while (bookInfo.toUpperCase().startsWith("Y"));

        System.out.println("Author's information = " + author);
        if (!bookList.isEmpty()) System.out.println("Author's books are as listed below:");

        for (Book book : bookList) {
            System.out.println(book);
        }


    }
}
