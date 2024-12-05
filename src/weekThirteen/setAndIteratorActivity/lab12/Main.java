package weekThirteen.setAndIteratorActivity.lab12;

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        //ages
        ds.addAge(30);
        ds.addAge(29);
        ds.addAge(28);

        ds.printAges();
        System.out.println();

        ds.removeAge();

        ds.printAges();
        System.out.println();

        //students
        ds.addStudent("Shaun");
        ds.addStudent("J.P.");
        ds.addStudent("Ashton");
        ds.addStudent("Ryan");

        ds.printStudent();
        System.out.println();

        ds.removeStudent("Ryan");
        ds.removeStudent("Ashton");

        ds.printStudent();
        System.out.println();

        //gpas
        ds.addGpa("Computer Science", 4.0);
        ds.addGpa("Mathematics", 3.7);

        ds.printGpa();
        System.out.println();

        ds.removeGpa("Mathematics", 3.7);

        ds.printGpa();
        System.out.println();

        //nationalities
        ds.addNationality("Uzbekistanian");
        ds.addNationality("Mesopotamian");
        ds.addNationality("Norwegian");

        ds.printNationality();
        System.out.println();

        ds.removeNationality();

        ds.printNationality();
        System.out.println();

        //hometowns
        ds.addHometown("Fort Wayne");
        ds.addHometown("Gary");
        ds.addHometown("Beech Grove");

        ds.printHometowns();
        System.out.println();

        ds.removeHometown();

        ds.printHometowns();
        System.out.println();

        //home states
        ds.addHomeState("Indiana");
        ds.addHomeState("District of Columbia");
        ds.addHomeState("Guam");

        ds.printHomeStates();
        System.out.println();

        ds.removeHomeState("District of Columbia");

        ds.printHomeStates();
        System.out.println();
    }
}
