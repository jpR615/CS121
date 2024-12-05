package weekSeven;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Car car1 = new Car("Honda", "Civic", 2006);
        car1.displayCarInfo();

        System.out.println();

        Movie movie1 = new Movie("The Fellowship of the Ring", "Peter Jackson", 2001);
        movie1.displayMovieInfo();
    }
}
