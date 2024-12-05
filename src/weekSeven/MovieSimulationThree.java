package weekSeven;
import java.util.*;

public class MovieSimulationThree {
    public static void main(String[] args) {
        String[] movieNames = {"Return of the King", "Jurassic Park", "The Dark Knight"};
        String[] movieTypes = {"Fantasy", "Thriller", "Action"};
        int[] moviePrices = {25, 15, 20};
        final int ROWS = 5;
        final int COLUMNS = 10;

        int[][] movieAvailability = new int[ROWS][COLUMNS];
        displayMovieDetails(movieNames, movieTypes, moviePrices);
        int index = selectMovie(movieNames);
        System.out.println();
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        randomizeAvailability(movieAvailability);
        System.out.println();
        System.out.println("----------AVAILABLE SEATS---------");
        System.out.println();
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
        System.out.println();
        displaySeatAvailability(movieAvailability);
    }

    public static int selectMovie(String[] movieNames) {
        Scanner scn = new Scanner(System.in);
        String selectedMovie;
        while(true){
            System.out.println("\nEnter movie: ");
            selectedMovie = scn.nextLine();
            for (int i = 0; i < movieNames.length; i++){
                if(selectedMovie.equals(movieNames[i])){
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    public static void setSeatAvailability(int[][] movieAvailability) {
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

    public static void randomizeAvailability(int[][] movieAvailability) {
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                if (Math.random() < 0.4) {
                    movieAvailability[i][j] = 0;
                } else {
                    movieAvailability[i][j] = 1;
                }
            }
        }
    }

    public static void displaySeatAvailability(int[][] movieAvailability) {
        char rowLabel[] = {'A', 'B', 'C', 'D', 'E'};
        for (int c = 1; c <= movieAvailability[0].length; c++) {
            System.out.printf(" %d", c);
        }
        System.out.printf("\n %s\n", "-".repeat(20));
        for (int i = 0; i < movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.print(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, int[] moviePrices) {
        System.out.println("---------------- Movie Details ------------------");
        String header = String.format("%-20s %-20s %-20s", "Movie Name:", "Movie Genre:", "Ticket Price:");
        System.out.println(header);
        for (int i = 0; i < movieNames.length; i++) {
            String output = String.format("%-20s %-20s %-20d", movieNames[i], movieTypes[i], moviePrices[i]);
            System.out.println(output);
        }
    }

    static void displaySelectedMovie(String movieNames, String movieTypes, int moviePrices){
        System.out.printf("\n%s MOVIE SELECTION %s\n","-".repeat(20),"-".repeat(20));
        System.out.printf("%-20s %-20s %-20s\n", "Movie Name:", "Movie Genre:", "Ticket Price:");
        System.out.printf("%-25s %-20s $%d\n", movieNames, movieTypes, moviePrices);
    }
}