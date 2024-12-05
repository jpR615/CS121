package weekThree;
import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {
        String joe = ("Joe's Gourmet Burgers");
        String main = ("Main Street Pizza Company");
        String corner = ("Corner Cafe");
        String mama = ("Mama's Fine Italian");
        String chef = ("The Chef's Kitchen");
        String Message;

        String vegetarian, vegan, glutenFree;

        vegetarian = JOptionPane.showInputDialog("Is there anyone in your party that is vegetarian?");

        vegan = JOptionPane.showInputDialog("Is there anyone in your party that is vegan?");

        glutenFree = JOptionPane.showInputDialog("Is there anybody in your party that is gluten-free?");

        if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("no")) {
            Message = String.format("Here are your restaurant choices:\n %s\n%s\n%s\n%s",main, corner, mama, chef);

        } else if (vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("no")) {
            Message = String.format("All restaurants are available");

        } else if (vegetarian.equals("no") && vegan.equals("yes") && glutenFree.equals("no")) {
            Message = String.format("Here are your restaurant choices:\n %s\n%s\n%s",corner, chef);

        } else if (vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("yes")) {
            Message = String.format("Here are your restaurant choices:\n %s\n%s\n%s",main, corner, chef);

        } else if (vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("no")) {
            Message = String.format("Here are your restaurant choices:\n %s\n%s",corner, chef);


        } else if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("yes")) {
            Message = String.format("Here are your restaurant choices:\n %s\n%s\n%s",main,corner, chef);

        } else{
            Message = String.format("Here are your restaurant choices:\n %s\n%s\n", corner, chef);
        }

        JOptionPane.showMessageDialog(null,Message);
    }
}