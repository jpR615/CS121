package weekOne;

public class Firstcodewithme {
    public static void main(String[] args) {
       //Declaring variables
       int age;
       double gpa;
       char letterGrade;
       boolean csMajor;
       String name;

       //Initialize variables
       age = 1;
       gpa = 3.9;
       letterGrade = 'A';
       csMajor = true;
       name = "J.P.";

       String favoriteColor = "Periwinkle";

       //Printing these variables
       //print
       //println
       //printf - formatting
       System.out.printf("The age of this person is: %d%n --------",age);
       System.out.printf("The gpa is %.2f%n", gpa);
       System.out.printf("The letter grade is: %c%n", letterGrade);
       System.out.printf("Is is true that your major is computer science? %b%n", csMajor);
       System.out.printf("This person's name is %s%n", name);
       System.out.println("Your age is: " + age);
    }
}
