package weekEight.packageDemo;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Person person1 = new Person("J.P.", 19, "CS", 3.9, 'A');

        person1.displayYear();
        person1.displayGrades();
        person1.displayPersonInfo();
    }

}
