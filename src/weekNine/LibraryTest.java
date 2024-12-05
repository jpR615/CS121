package weekNine;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Library user1 = new Library("J.P. Rogers", "The Lord of the Rings", "10-14", "11-14", true);
        user1.getUserName();
        user1.setUserName("J.P. Rogers");
        user1.getBookName();
        user1.setBookName("The Lord of the Rings");
        user1.getBorrowDate();
        user1.setBorrowDate("10-14");
        user1.getReturnDate();
        user1.setReturnDate("11-14");
        user1.getPriority();
        user1.setPriority(true);
        user1.checkPriority();
    }
}
