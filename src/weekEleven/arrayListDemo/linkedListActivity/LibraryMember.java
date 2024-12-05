package weekEleven.arrayListDemo.linkedListActivity;
import java.util.LinkedList;

public class LibraryMember {
    private String name, email, phone;
    private double lateFee;
    private LinkedList<String> borrowedBookList = new LinkedList<>();

    public LibraryMember(String name, String email, String phone, double lateFee) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.lateFee = lateFee;
    }

    public void addBorrowedBook(String bookName) {
        borrowedBookList.add(bookName);
    }

    public void returnBorrowedBook(String bookName) {
        borrowedBookList.remove(bookName);
    }

    public String getMemberInfo() {
        return name + ", " + email + ", " + phone + ", " + "$" + lateFee;
    }

    public void displayBorrowedBooks() {
        System.out.println(borrowedBookList);
    }
}
