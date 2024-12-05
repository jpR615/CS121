package weekTwelve.fileIO;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException{
        File outputFile = new File("courses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        Scanner scn = new Scanner(System.in);
        output.printf("%-20s %-20s %-17s %-20s %-20s","<User Name>", "<Password>", "<Score>", "<Player>", "<Winning Percentage>");
        String name, password, playerCharacter;
        int score;
        double winningPercentage;
        for(int i = 0; i < 2; i++){
            name = JOptionPane.showInputDialog(String.format("Enter user %d's username: ", (i + 1)));
            password = JOptionPane.showInputDialog(String.format("Enter user %d's password: ", (i + 1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's character: ", (i + 1)));
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score: ", (i + 1))));
            winningPercentage = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage: ", (i + 1))));
            output.printf("%-20s %-20s %6s %23s %15.2s",name, password, score, playerCharacter, winningPercentage);
        }
        scn.close();
        output.close();
    }
}
