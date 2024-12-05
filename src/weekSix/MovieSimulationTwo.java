package weekSix;
import java.util.*;

public class MovieSimulationTwo {
    public static void main(String[] args) {
        String[] movieNames = {"Return of the King", "Jurassic Park", "The Dark Knight"};
        String[] movieTypes = {"Fantasy", "Thriller", "Action"};
        int[] moviePrices = {25, 15, 20};
        final int ROWS = 5;
        final int COLUMNS = 10;

        int[][] movieAvailability = new int[ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);
        setSeatAvailability(movieAvailability);
        System.out.println();
        System.out.println("---------- INITIAL SEATS ----------");
        System.out.println();
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
        System.out.println();
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        System.out.println();
        System.out.println("---------- RANDOM SEATS ----------");
        System.out.println();
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
        System.out.println();
        displaySeatAvailability(movieAvailability);
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

    public static void displaySeatAvailability(int[][] movieAvailability){
        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length; j++){
                System.out.print(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void displayMovieDetails (String[]movieNames, String[]movieTypes, int[] moviePrices){
            System.out.println("---------------- Movie Details ------------------");
            String header = String.format("%-20s %-20s %-20s", "Movie Name:", "Movie Genre:", "Ticket Price:");
            System.out.println(header);
            for (int i = 0; i < movieNames.length; i++) {
                String output = String.format("%-20s %-20s %-20d", movieNames[i], movieTypes[i], moviePrices[i]);
                System.out.println(output);
            }
        }

}
