package weekNine;

public class LibraryMember {
    protected String name;
    protected String bookTitle;
    protected String borrowDate;

    public LibraryMember(String bookTitle, String name, String borrowDate) {
        this.bookTitle = bookTitle;
        this.name = name;
        this.borrowDate = borrowDate;
    }

    public String toString() {
        return "Member: " + name + ", Book: " + bookTitle + ", Borrow Date: " + borrowDate;
    }
}
