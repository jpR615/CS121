package weekSeven;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayCarInfo(){
        System.out.printf("%s\n%s\n%d\n", make, model, year);
    }
}
