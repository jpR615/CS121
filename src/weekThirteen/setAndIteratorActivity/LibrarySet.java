package weekThirteen.setAndIteratorActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class LibrarySet {
    Set<String> bookIDs = new HashSet<>();

    public void addBooks() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter books IDs to add (enter '0' to quit'): ");
        while(true) {
            String bookID =  scn.nextLine();
            if (bookID.equals("0")) {
                return;
            }

            else {
                bookIDs.add(bookID);
            }
        }
    }

    public void displayBooks() {
        Iterator<String> iterator = bookIDs.iterator();
        System.out.println("Library Books: ");
        System.out.println();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
