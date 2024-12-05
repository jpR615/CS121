package weekEight.packageDemo;

import javax.crypto.spec.PSource;

public class Student {
    private String name;
    private String id;
    private String classStanding;
    private String major;
    private double gpa;

    public String getName(String s) {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getId(String number) {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getClassStanding(String number) {
        return classStanding;
    }

    public void setClassStanding() {
        this.classStanding = classStanding;
    }

    public String getMajor(String cs) {
        return major;
    }

    public void setMajor() {
        this.major = major;
    }

    public double getGpa(double v) {
        return gpa;
    }

    public void setGpa() {
        this.gpa = gpa;
    }

    public Student(String id, String name, String classStanding, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.classStanding = classStanding;
        this.major = major;
        this.gpa = gpa;

    }
    public void displayInfo(){
        System.out.println(id+ name +classStanding+ major+ gpa);
    }
}
