package weekFour;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = 35;
        //System.out.println("Guess a number in between 1 and 100, or enter 'q' if you give up.");
        //String userGuess =  scn.nextLine();
        boolean q = false;
        //int uGuess = Integer.parseInt(userGuess);
        while (!q) {
            System.out.println("Guess a number in between 1 and 100, or enter 'q' if you give up.");
            String uGuess =  scn.nextLine();
            //int uGuess = Integer.parseInt(userGuess);
            if (uGuess.equals("q")) {
                System.out.println("Quitter");
                q = true;
                break;
            }
            else if (Integer.parseInt(uGuess) > number) {
                System.out.println("Too high.");
            }
            else if (Integer.parseInt(uGuess) < number) {
                    System.out.println("Too low.");
            }
            else {
                System.out.println("Just right.");
                break;
            }
        }
    }
}
