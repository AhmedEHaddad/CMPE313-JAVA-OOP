import javax.swing.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class BookCopy extends Book {
    private int copyID;

    BookCopy(int id) {
        this.copyID = copyID;
    }

    public void borrow(Date returnDate, Customer customer) throws ParseException {
        if(this.copies>=1 ) {
           //this.borrowDate = Calendar.getInstance().getTime();
           // Date today = dateFormat.parse(dateFormat.format(new Date()));
            this.borrowDate = dateFormat.parse(dateFormat.format(new Date()));
            //this.setReturnDate(borrowDate.add(Calendar.DAY_OF_MONTH, period));
            this.setReturnDate(returnDate);
            this.copies -= 1;
            if (copies < 1) {
                this.setAvailable(false);
            }

        } else if (this.copies < 1) {
            JOptionPane.showMessageDialog(null, "This book is not available");
            this.setAvailable(false);
        }
    }
}
