package weekTwo;

import javax.swing.JOptionPane;

public class WordGame{
    public static void main(String[] args) {
        String name;

        //prompt the user
        name = JOptionPane.showInputDialog("Enter your name: ");
        //String.format() = generate a message
        //Storing the message in a formatted way in the variable message.
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String city;
        city = JOptionPane.showInputDialog("Enter your city: ");
        String college;
        college = JOptionPane.showInputDialog("Enter your college: ");
        String major;
        major = JOptionPane.showInputDialog("Enter your major: ");
        String animal;
        animal = JOptionPane.showInputDialog("Enter your animal: ");
        String petName;
        petName = JOptionPane.showInputDialog("Enter your pet's name: ");

        String message = String.format("The person %s is from %s. They are %d years old at %s studying %s. " +
                "They adopted a %s named %s.",name,city,age,college,major,animal,petName);
        JOptionPane.showMessageDialog(null, message);
    }
}
