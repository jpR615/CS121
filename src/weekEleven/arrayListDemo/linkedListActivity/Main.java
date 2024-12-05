package weekEleven.arrayListDemo.linkedListActivity;

public class Main {
    public static void main(String[] args) {
        LibraryMember member1 = new LibraryMember("Greg", "greg1@gmail.com", "756-573-2852", 3.25);
        member1.addBorrowedBook("Lord of the Rings");
        member1.addBorrowedBook("Moby Dick");
        member1.addBorrowedBook("The Catcher in the Rye");
        System.out.println(member1.getMemberInfo());
        member1.displayBorrowedBooks();
        member1.returnBorrowedBook("Moby Dick");
        member1.displayBorrowedBooks();

        System.out.println();

        LibraryMember member2 = new LibraryMember("Emily", "emily2@gmail.com", "969-395-2952", 0.05);
        member2.addBorrowedBook("The Handmaid's Tale");
        member2.addBorrowedBook("Pride and Prejudice");
        member2.addBorrowedBook("The Stand");
        member2.addBorrowedBook("The Way of Kings");
        System.out.println(member2.getMemberInfo());
        member2.displayBorrowedBooks();
        member2.returnBorrowedBook("Pride and Prejudice");
        member2.displayBorrowedBooks();
    }
}
