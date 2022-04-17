import java.util.List;

public class Author {



    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    public Author(String firstName, String lastName, String country, String isAlive, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        //this.bookList = bookList;
    }



    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    public String firstName;
    public String lastName;
    public String country;
    public String isAlive;
    public int age;
    //public List<Book> bookList;


    /*
    Override toString() method here that returns Author object information
     */

    @Override
    public String toString() {
        String a = "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive ;
                if (this.isAlive.toUpperCase().startsWith("Y")) a += ", age=" + age;
                a += '}';
        return a;
    }
}
