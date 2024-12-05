import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //methods(parameters/arguments) and for loops
        String[] teams = {"Cubs", "Brewers", "Cardinals", "Pirates", "Reds"};

        for (String team : teams){
            //System.out.println(team);
        }

        //arrays and array lists
        Scanner scn = new Scanner(System.in);
        //System.out.println("How many numbers would you like to input?");
        //int numInputs = Integer.parseInt(scn.nextLine());
        //int[] input = new int[numInputs];
        //ArrayList numList = new ArrayList();
        //for(int i = 0; i < numInputs; i++){
            //System.out.println("Enter number " + (i + 1) +": ");
            //input[i] = Integer.parseInt(scn.nextLine());
            //System.out.println("You entered " + input[i]);
            //numList.add(i);
            //System.out.println();
        //}
        //System.out.println(numList);
        //String str1 = new String("Hello!");
        //String str2 = new String("Hello!");
        //System.out.println(str1);
        //System.out.println(str1 == str2);
        //System.out.println(str1.equals("Hello!"));

        //int int1 = 50;
        //System.out.println(String.valueOf(int1));

        int n = 3;
        boolean ps = true;
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                ps = true;
                break;
            }
            else {
                ps = false;
            }
        }
        System.out.println("Is " + n + " a prime number?: " + ps);
    }
}
