import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        final int SIZE = rand.nextInt(3, 10);
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println("Enter your " + SIZE + " test scores");
        for (int i = 0; i < testScores.length; i++){
            System.out.println("Enter test " + (i + 1) + " score: ");
            testScores[i] = Integer.parseInt(scn.nextLine());
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        for (int currScore : testScores) {
            getLetterGrade(currScore);
        }
        printGrades(testScores,letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scn.close();
    }

    public static char getLetterGrade(int currScore) {
        if (currScore >= 90) {
            return 'A';
        } else if (currScore >= 80) {
            return 'B';
        } else if (currScore >= 70) {
            return 'C';
        } else if (currScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void printGrades(int[] testScores, char[] letterGrades) {
        System.out.println("Score\t\tGrade");
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("%d\t\t\t%c\n", testScores[i], letterGrades[i]);
        }
    }

    public static void printHighestScore(int[] testScores) {
        int highestScore = -1;
        for (int testScore : testScores) {
            if (testScore > highestScore) {
                highestScore = testScore;
            }
        }
        System.out.println("Highest score: " + highestScore);
    }

    public static void printLowestScore(int[] testScores) {
        int lowestScore = 1000000;
        for (int testScore : testScores) {
            if (testScore < lowestScore) {
                lowestScore = testScore;
            }
        }
        System.out.println("Lowest score: " + lowestScore);
    }

    public static void printAverageScore(int[] testScores) {
        int allScores = 0;
        for (int testScore : testScores) {
            allScores = allScores + testScore;
        }
        double averageScore = (double) allScores /testScores.length;
        System.out.println("Average test score: " + averageScore);
    }
}