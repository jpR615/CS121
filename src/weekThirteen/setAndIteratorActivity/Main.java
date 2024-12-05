package weekThirteen.setAndIteratorActivity;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySet libraryset = new LibrarySet();
        Scanner scn = new Scanner(System.in);

        boolean loop = true;
        while(loop) {
            System.out.println("Library Book Management System");
            System.out.println("Option 1: Add a book ID (press 1)");
            System.out.println("Option 2: View all books IDs (press 2)");
            System.out.println("Option 3: Exit the system (press 3)");
            int input = Integer.parseInt(scn.nextLine());
            switch(input) {
                case 1:
                    libraryset.addBooks();
                    break;
                case 2:
                    libraryset.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    loop = false;
                    break;
                default:
                    System.err.println("Error: invalid option");
                    break;
            }
        }
    }
}
