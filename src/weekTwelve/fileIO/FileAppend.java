package weekTwelve.fileIO;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import javax.swing.*;

public class FileAppend {
    public static void main(String[] args) throws IOException{
        try{
            FileWriter fileWriter = new FileWriter("courses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            String name = JOptionPane.showInputDialog("Enter the user's name: ");
            String password = JOptionPane.showInputDialog("Enter the user's password: ");
            String playerCharacter = JOptionPane.showInputDialog("Enter the user's player character: ");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the user's score: "));
            double winningPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percentage: "));

            output.printf("%-20s %-20s %6s %23s %15.2s",name, password, score, playerCharacter, winningPercentage);

            fileWriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Your file was not found.");
        }
    }
}
