package weekTen.abstractClasses;

import weekTen.interfaces.Borrowable;

public class LibraryBook extends LibraryItems implements Borrowable {
    private String bookName;

    public LibraryBook(String bookName, String borrowDate, String returnDate) {
        super(borrowDate, returnDate);
        this.bookName = bookName;
    }

    @Override
    public void printInfo() {
        String dates = this.getBorrowAndReturnDates();

        System.out.println("Book name: " + bookName);
        System.out.println(dates);
    }

    @Override
    public void borrowConfirmation() {
        System.out.println("Book successfully checked out!");
    }

    @Override
    public void branchName() {
        System.out.println("Book borrowed from North Branch.");
    }
}
