package weekEight.packageDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("1234", "J.P.", "10", "CS", 3.9);
        student1.getName("J.P.");
        student1.setName();
        student1.getId("1234");
        student1.setId();
        student1.getClassStanding("10");
        student1.setClassStanding();
        student1.getMajor("CS");
        student1.setMajor();
        student1.getGpa(3.9);
        student1.setGpa();
        student1.displayInfo();
    }
}
