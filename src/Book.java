import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {
   protected String Title, Author;
   protected int ISBN, copies;
   protected Customer customer;
   protected SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   protected Date borrowDate;
   protected Date returnDate;
   protected boolean available;


    Book() {

    }

    Book(int isbn) {

        this.ISBN = isbn;
        this.copies = 1;
        this.available = true;
    }

    Book(int isbn, String title, String author , int copies) {
        this.ISBN=isbn;
        this.Title = title;
        this.Author = author;
        this.copies = copies;
        this.available = true;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getCopies() {
        return copies;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }


}
