package weekEleven.arrayListDemo;

import java.util.HashMap;

public class LibraryUser {
    String userName;
    String userID;
    String membershipType;
    HashMap<String, String> borrowedBooks = new HashMap<>();
    String bookID;
    String borrowerDetails;

    public void addBorrowedBook(String bookID, String borrowDetails) {
        borrowedBooks.put(bookID, borrowDetails);
    }

    public void removeBorrowedBook(String bookID) {
        borrowedBooks.remove(bookID);
    }

    public String getBorrowedBookDetails(String bookID) {
        return bookID;
    }

    public void displayAllBorrowedBooks() {
        borrowedBooks.forEach((bookID, borrowerDetails) -> {
            System.out.println("Book ID: " + bookID + " --- Details: " + borrowerDetails);
        });
    }
}
