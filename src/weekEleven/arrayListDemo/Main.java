package weekEleven.arrayListDemo;

public class Main {
    public static void main(String[] args) {
        LibraryUser user1 = new LibraryUser();
        user1.addBorrowedBook("101851", "Moby Dick, 11-1-24, 12-1-24");
        user1.addBorrowedBook("022817", "The Hate U Give, 10-28-24, 11-28-24");
        user1.addBorrowedBook("012109", "The Odyssey, 10-15-1-24, 11-15-24");
        user1.displayAllBorrowedBooks();
        System.out.println();
        user1.removeBorrowedBook("101851");
        user1.displayAllBorrowedBooks();
    }
}