package weekNine;

public class Main {
    public static void main(String[] args) {
        RegularMember rm = new RegularMember("1984", "Alice", "10-01-2024", "10-15-2024");
        PriorityMember pm = new PriorityMember("War and Peace", "Bob", "10-02-2024", "PM123");
        System.out.println(rm.toString());
        System.out.println(pm.toString());
    }
}
