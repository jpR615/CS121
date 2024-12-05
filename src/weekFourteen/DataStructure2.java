package weekFourteen;
import java.util.*;

//1. What is the purpose of generics in Java? - Generics are used to make code more simple and reusable.
//They are also used to improve the readability of code.

//2. How can generics be used in Java programming? - Generics allow one method to be used with multiple data types.
//For example, if you want to add values to an array(s), using generics makes it possible to add multiple data types to
//an array without having to write a new method for each unique data type.

//3. What are the pros and cons of using generics? - Pros: generics make code easier to read, more efficient and more reusable.
//Cons: Sometimes the logic behind generics can be confusing (especially for beginners).

//I pretty much just changed all instances of any type declarations (int, String, Double, etc.) to T.

public class DataStructure2<T>{
    final private int SIZES = 10;
    private ArrayList<T> studentList = new ArrayList<>();
    private T [] ageList = (T[]) new Object[SIZES];
    private int ageIndex = 0;
    private HashMap<T, T> majorGpaMap = new HashMap<>();
    private LinkedList<T> nationalityList = new LinkedList<>();
    private Stack<T> hometownStack = new Stack<>();
    private Queue<T> homeStateQueue = new LinkedList<>();

    //studentList
    public void addStudent(T name) {
        studentList.add(name);
    }

    public void removeStudent(T name) {
        studentList.remove(name);
    }

    public void printStudent() {
        System.out.println("Students: ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    //ageList
    public void addAge(T age) {
        if(ageIndex<ageList.length){
            ageList[ageIndex ++] = age;
        }
    }

    public void removeAge() {
        if (ageIndex > 0) {
            ageList[--ageIndex] = null;
        }
    }

    public void printAges() {
        System.out.println("\nAges: ");
        for (T age : ageList) {
            System.out.println(age);
        }
    }

    //majorGpaMap
    public void addGpa(T major, T gpa) {
        majorGpaMap.put(major, gpa);
    }

    public void removeGpa(T major, T gpa) {
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
    public void addNationality(T nation) {
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
    public void addHometown(T hometown) {
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
    public void addHomeState(T homeState) {
        homeStateQueue.add(homeState);
    }

    public void removeHomeState(T homeState) {
        homeStateQueue.remove(homeState);
    }
    public void printHomeStates() {
        Iterator<T> iterator = homeStateQueue.iterator();
        System.out.println("Home states: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
