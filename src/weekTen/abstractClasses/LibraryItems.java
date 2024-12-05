package weekTen.abstractClasses;

public abstract class LibraryItems {
    protected String borrowDate;
    protected String returnDate;

    public LibraryItems(String borrowDate, String returnDate) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    abstract void printInfo();

    public String getBorrowAndReturnDates() {
        return "Borrowed: " + borrowDate + "\n" + "Due back: " + returnDate;
    }

    public abstract void borrowConfirmation();

    public abstract void branchName();
}
