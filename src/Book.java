import java.util.Date;

public class Book {
   private String Title, Author;
   private int ISBN, copies;
   private Customer customer;
   private Date borrowDate;
   private Date returnDate;
   private boolean available;

    Book(int isbn) {
        this.ISBN = isbn;
    }

    Book(int isbn, String title, String author) {
        this.ISBN=isbn;
        this.Title = title;
        this.Author = author;
    }

    


}
