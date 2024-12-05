package weekEight.packageDemo;

public class Person {
    public String name;
    public int age;
    private String major;
    private double GPA;
    private char grade;

    public Person(String Name, int Age, String Major, double GPA, char Grade) {
        this.name = Name;
        this.age = Age;
        this.major = Major;
        this.GPA = GPA;
        this.grade = Grade;
    }

     private String calcYear(){
        if (this.age < 17){
            return "freshman";
        }
        else if (this.age < 20){
            return "sophomore";
        }
        else if (this.age < 23){
            return "junior";
        }
        else {
            return "senior";
        }
    }

    protected void displayYear() {
        System.out.println("Student year: ");
        System.out.println(calcYear());
    }

    void displayGrades() {
        System.out.println("Student GPA and current grade: ");
        System.out.printf("%.1f\n%c", GPA, grade);
        System.out.println();
    }

    public void displayPersonInfo() {
        System.out.println("Student information: ");
        System.out.printf("%s\n%d\n%s\n%.1f\n%c", name, age, major, GPA, grade);
        System.out.println();
    }



}
