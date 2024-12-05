package weekNine;
import java.util.Random;

public class Library {
    //instance variables
    private String userName;
    private String bookName;
    private String borrowDate;
    private String returnDate;
    private boolean priority;
    private int memberID;

    //getter and setter for userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //getter and setter for bookName
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //getter and setter for borrowDate
    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    //getter and setter for returnDate
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    //getter and setter for priority member
    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    //getter and setter for priority member ID
    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    //overloaded constructor 2
    public Library(String userName, String bookName, String borrowDate, String returnDate, boolean priority) {
        this.userName = userName;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.priority = priority;
    }

    public void checkPriority() {
        if (!priority) {
            displayInfo(userName, bookName, borrowDate, returnDate);
        }
        else {
            displayInfo(memberID, bookName);
        }
    }


    public void displayInfo(String userName, String bookName, String borrowDate, String returnDate){
        Random rand = new Random();
        System.out.println("Thank you for using our library!");
        System.out.println("Name: " + userName);
        System.out.println("Book Title: " + bookName);
        System.out.println("Borrow date: " + borrowDate);
        System.out.println("Return date: " + returnDate);
        System.out.println("Reservation number: " + rand.nextInt(10000));
    }

    public void displayInfo(int memberID, String bookName){
        Random rand = new Random();

        System.out.println("Thank you for using our library, Priority Member!");
        System.out.println("Member ID: " + memberID);
        System.out.println("Book Title: " + bookName);
        System.out.println("Reservation number: " + rand.nextInt(10000));
    }
}
