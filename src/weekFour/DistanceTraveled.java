package weekFour;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        int speed, time, i, j;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the speed of the vehicle in mph: ");
        speed = Integer.parseInt(scn.nextLine());

        System.out.println("Enter the number of hours traveling: ");
        time = Integer.parseInt(scn.nextLine());

        System.out.println("Hour" + "\t\t" + "Distance");
        System.out.println("---------------------");
        for (i = 0; i <= time; i++) {
            System.out.println(i + "\t\t\t" + (speed * i));
        }
    }
}
