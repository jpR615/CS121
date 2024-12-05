package weekTen.abstractClasses;

public class Test {
    public static void main(String[] args) {
        LibraryBook myBook = new LibraryBook("The Lord of the Rings", "10-21-2024", "11-21-2024");
        LibraryDVD myDVD = new LibraryDVD("The Two Towers", "10-21-2024", "11-21-2024");

        myBook.printInfo();
        myBook.borrowConfirmation();
        myBook.branchName();
        System.out.println();
        myDVD.printInfo();
        myDVD.borrowConfirmation();
        myDVD.branchName();
    }
}
