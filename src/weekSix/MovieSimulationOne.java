package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many movies would you like to enter: ");
        final int NUM_OF_MOVIES = Integer.parseInt(scn.nextLine());

        String[] movieNames = new String[NUM_OF_MOVIES]; //{"1","2","3","4"};
        String[] movieTypes = new String[NUM_OF_MOVIES]; //{"1","2","3","4"};
        int[] movieAvailability = new int[NUM_OF_MOVIES]; //{1,2,3,4};
        double[] moviePrices = new double[NUM_OF_MOVIES]; //{1.0,2.0,3.0,4.0};


        for (int i = 0; i < NUM_OF_MOVIES; i++) {
            System.out.println("Enter in your movie details: " + (i + 1));
            System.out.println("Movie name: ");
            movieNames[i] = scn.nextLine();
            System.out.println("Movie genre: ");
            movieTypes[i] = scn.nextLine();
            System.out.println("Ticket availability: ");
            movieAvailability[i] = Integer.parseInt(scn.nextLine());
            System.out.println("Ticket price: ");
            moviePrices[i] = Double.parseDouble(scn.nextLine());
        }
        displayMovieDetails(movieNames, movieTypes, movieAvailability, moviePrices);
    }

    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, int[] movieAvailability, double[] moviePrices) {
        System.out.println("\nMovie details: ");
        String header = String.format("%-20s %-20s %-20s %-20s", "Movie Name:", "Movie Genre:", "Ticket Availability:", "Ticket Price:");
        System.out.println(header);
        for (int i = 0; i < movieNames.length; i++) {
            String output = String.format("%-20s, %-20s, %-20d %-20f", movieNames[i], movieTypes[i], movieAvailability[i], moviePrices[i]);
            System.out.println(output);
        }
    }
}

