package weekTwo;

import javax.swing.*;
import java.util.Scanner;

public class ActivityOneDialog {
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
        //sout + tab = System.out.println()

        P = Double.parseDouble(JOptionPane.showInputDialog("Enter principle amount: "));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter annual interest rate: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of times interest rate is compounded: "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years: "));

        //A = P(1 + r/n)^nt
        A = P * Math.pow((1+r/n),n * t);

        //sout + tab = System.out.printf("");
        //%s - string
        //%f - float
        //%d - integer
        //%c - character
        String Message = String.format("The balance of the account after %d years you will have $ %.2f",t, A);
        JOptionPane.showMessageDialog(null,Message);
    }
}
