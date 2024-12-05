package weekNine;

public class PriorityMember extends LibraryMember{
    protected String memberID;

    public PriorityMember(String bookTitle, String name, String borrowDate, String memberID) {
        super(bookTitle, name, borrowDate);
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Member ID: " + memberID + " (Priority Member)";
    }
}
