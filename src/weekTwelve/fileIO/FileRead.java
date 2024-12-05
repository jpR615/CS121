package weekTwelve.fileIO;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOutput = new File("courses.txt");
        try{
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s", header);
            while(console.hasNextLine()){
                String name = console.next();
                String password = console.next();
                String playerCharacter = console.next();
                int score = Integer.parseInt(console.next());
                double winningPercentage = Double.parseDouble(console.next());
                System.out.printf("%-20s %-20s %6s %23s %15.2s",name, password, score, playerCharacter, winningPercentage);
            }
            console.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
