package weekFive;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] commanderName = new String[3];
        String[] colorIdentity = new String[3];
        double[] manaCurve = new double[3];
        System.out.println("Enter your commander's name: ");
        commanderName[0] = scn.nextLine();
        System.out.println("Enter your commander's color identity: ");
        colorIdentity[0] = scn.nextLine();
        System.out.println("Enter your deck's mana curve: ");
        manaCurve[0] = Double.parseDouble(scn.nextLine());
        System.out.println();

        System.out.println("Enter your commander's name: ");
        commanderName[1] = scn.nextLine();
        System.out.println("Enter your commander's color identity: ");
        colorIdentity[1] = scn.nextLine();
        System.out.println("Enter your deck's mana curve: ");
        manaCurve[1] = Double.parseDouble(scn.nextLine());
        System.out.println();

        System.out.println("Enter your commander's name: ");
        commanderName[2] = scn.nextLine();
        System.out.println("Enter your commander's color identity: ");
        colorIdentity[2] = scn.nextLine();
        System.out.println("Enter your deck's mana curve: ");
        manaCurve[2] = Double.parseDouble(scn.nextLine());
        System.out.println();

        System.out.println("NAME\t\tCOLORS\t\tCURVE");
        System.out.printf("%s\t\t\t%s\t\t\t%.1f",commanderName[0],colorIdentity[0],manaCurve[0]);
        System.out.println();
        System.out.printf("%s\t\t\t%s\t\t\t%.1f",commanderName[1],colorIdentity[1],manaCurve[1]);
        System.out.println();
        System.out.printf("%s\t\t\t%s\t\t\t%.1f",commanderName[2],colorIdentity[2],manaCurve[2]);
    }
}
