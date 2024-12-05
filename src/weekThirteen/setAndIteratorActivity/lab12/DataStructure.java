package weekThirteen.setAndIteratorActivity.lab12;
import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private int ageIndex = 0;
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();


    //studentList
    public void addStudent(String name) {
        studentList.add(name);
    }

    public void removeStudent(String name) {
        studentList.remove(name);
    }

    public void printStudent() {
        System.out.println("Students: ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    //ageList
    public void addAge(int age) {
        if(ageIndex<ageList.length){
            ageList[ageIndex ++] = age;
        }
    }

    public void removeAge() {
        if (ageIndex > 0) {
            ageList[--ageIndex] = 0;
        }
    }

    public void printAges() {
        System.out.println("\nAges: ");
        for (int i = 0; i < ageList.length; i++) {
            System.out.println(ageList[i]);
        }
    }

    //majorGpaMap
    public void addGpa(String major, Double gpa) {
        majorGpaMap.put(major, gpa);
    }

    public void removeGpa(String major, Double gpa) {
        majorGpaMap.remove(major, gpa);
    }

    public void printGpa() {
        System.out.println("Majors and GPAs: ");
        majorGpaMap.forEach((major, gpa) -> {
            System.out.println("Major: " + major);
            System.out.println("GPA: " + gpa);
            System.out.println();
        });
    }

    //nationalityList
    public void addNationality(String nation) {
        nationalityList.add(nation);
    }

    public void removeNationality() {
        nationalityList.remove();
    }

    public void printNationality() {
        System.out.println("Nationalities: ");
        for (int i = 0; i < nationalityList.size(); i++) {
            System.out.println(nationalityList.get(i));
        }
    }

    //hometownStack
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }

    public void removeHometown() {
        hometownStack.pop();
    }

    public void printHometowns() {
        System.out.println("Hometowns: ");
        for (int i = 0; i < hometownStack.size(); i++) {
            System.out.println(hometownStack.get(i));
        }
    }

    //homeStateQueue
    public void addHomeState(String homeState) {
        homeStateQueue.add(homeState);
    }

    public void removeHomeState(String homeState) {
        homeStateQueue.remove(homeState);
    }
    public void printHomeStates() {
        Iterator<String> iterator = homeStateQueue.iterator();
        System.out.println("Home states: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
