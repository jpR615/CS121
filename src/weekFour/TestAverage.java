package weekFour;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numStudents, numTests, i, j, score, totalScore;
        double average;
        //i = numTests, j = numStudents
        System.out.print("Enter number of students: ");
        numStudents = Integer.parseInt(scn.nextLine());
        System.out.print("Enter number of tests per student: ");
        numTests = Integer.parseInt(scn.nextLine());
        for (j = 1; j<= numStudents; j++){
            System.out.println("Student " + j);
            System.out.println("---------");
            totalScore = 0;
            for (i = 1; i <= numTests; i++){
                boolean q = false;
                while (!q){
                System.out.print("Enter score " + i + ": ");
                score = Integer.parseInt(scn.nextLine());
                if (i == numTests) {
                    q = true;
                    totalScore = totalScore + score;
                    average = totalScore/i;
                    System.out.printf("The average score for student " + j + " is %.2f", average);
                    System.out.println();
                    break;
                }
                else{
                    totalScore = totalScore + score;
                    break;
                }
                }
            }

        }

    }
}
