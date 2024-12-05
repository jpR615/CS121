package weekTwo;

import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args){
        int bookBucks;
        String Message;
        bookBucks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books you bought this month: "));

                if (bookBucks == 0) {
                    Message = ("You earned 0 points! :(");
                }
                else if (bookBucks == 1) {
                    Message = ("You earned 5 points!");
                }
                else if (bookBucks == 2) {
                    Message = ("You earned 15 points!");
                }
                else if (bookBucks == 3) {
                    Message = ("You earned 30 points!");
                }
                else if ((bookBucks >= 4) && (bookBucks <= 99)) {
                    Message = ("You earned 60 points!");
                }
                else if (bookBucks >= 100) {
                    Message = ("You earned 60 points! (also why are you buying over 100 books in one month)");
                }
                else {
                    Message = ("Invalid input");
                }


        JOptionPane.showMessageDialog(null,Message);


                }
    }

