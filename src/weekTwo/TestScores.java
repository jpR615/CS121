package weekTwo;

import javax.swing.*;

public class TestScores{
    public static void main(String[] args){
        double testScore1, testScore2, testScore3,average;
        testScore1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first test score: "));
        testScore2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your second test score: "));
        testScore3 = Double.parseDouble(JOptionPane.showInputDialog("Enter your third test score: "));


        average = (testScore1 + testScore2 + testScore3) / 3;

        String Message, letterGrade;
        letterGrade = "";
            if (average < 60) {
                letterGrade = "F";
            }
            else if ((average >= 60) && (average <= 69)) {
                letterGrade = "D";
            }
            else if ((average >= 70) && (average <= 79)) {
                letterGrade = "C";
            }
            //the pdf said the range for B should be 89-89, but I assumed it meant to say 80-89
            else if ((average >= 80) && (average <= 89)) {
                letterGrade = "B";
            }
            else if (average >= 90){
                letterGrade = "A";
            }
        Message = String.format("Your average letter grade is %s", letterGrade);
        JOptionPane.showMessageDialog(null,Message);


    }
}