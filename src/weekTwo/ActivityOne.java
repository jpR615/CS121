package weekTwo;

//alt + enter = import java.util.Scanner
import java.util.Scanner;
import javax.swing.JOptionPane;

//Scanner
public class ActivityOne {
    // Shortcut main + tab
    public static void main(String[] args){
        //P - principle amount
        //r - annual interest rate
        //n - number of times per year interest rate is compounded
        //t - specified number of years
        //A - amount of money in account after the specified number of years

        //Declare
        double P, r, A;
        int n,t;

        //prompt user

        P = Double.parseDouble(JOptionPane.showInputDialog("Enter principle amount: "));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter annual interest rate: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of times interest rate is compounded: "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years: "));
        //sout + tab = System.out.println()
        System.out.println("Enter principle amount: ");


        //Make scanner object
        //Declare an object/create an instance of the scanner class
        Scanner scn = new Scanner(System.in);

        //scn.nextDouble(); or Double.parseDouble(scn.nextLine());
        P = Double.parseDouble(scn.nextLine());

        System.out.println("Enter annual interest rate: ");
        r = Double.parseDouble(scn.nextLine()) / 100;

        System.out.println("Enter the amount of times interest rate is compounded: ");
        n = Integer.parseInt(scn.nextLine());

        System.out.println("Enter the number of years: ");
        t = Integer.parseInt(scn.nextLine());
        System.out.println();


        //A = P(1 + r/n)^nt
        A = P * Math.pow((1+r/n),n * t);

        //sout + tab = System.out.printf("");
        //%s - string
        //%f - float
        //%d - integer
        //%c - character
       System.out.printf("After %d years you will have $ %.2f",t, A);
       String Message = String.format("The balance of the account after %d years you will have $ %.2f",t, A);
       JOptionPane.showMessageDialog(null,Message);
    }
}
