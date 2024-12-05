package weekTen.abstractClasses;

public class LibraryDVD extends LibraryItems {
    private String dvdName;

    public LibraryDVD(String dvdName, String borrowDate, String returnDate) {
        super(borrowDate, returnDate);
        this.dvdName = dvdName;
    }

    @Override
    public void printInfo() {
        String dates = this.getBorrowAndReturnDates();

        System.out.println("DVD name: " + dvdName);
        System.out.println(dates);
    }

    @Override
    public void borrowConfirmation() {
        System.out.println("DVD successfully checked out!");
    }

    @Override
    public void branchName() {
        System.out.println("DVD borrowed from East Branch.");
    }
}
