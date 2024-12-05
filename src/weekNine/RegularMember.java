package weekNine;

public class RegularMember extends LibraryMember {
    protected String returnDate;

    public RegularMember(String bookTitle, String name, String borrowDate, String returnDate) {
        super(bookTitle, name, borrowDate);
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Return Date: " + returnDate;
    }
}
