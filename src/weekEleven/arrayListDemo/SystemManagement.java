package weekEleven.arrayListDemo;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SystemManagement {
    public static void numbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        for (Integer number : numbers) {
            System.out.println(numbers);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i);
        }

        System.out.println(numbers.get(1));

        numbers.remove(0);

        for (Integer number : numbers) {
            System.out.println(numbers);
        }

        System.out.println(numbers.size());
        System.out.println();
    }


    public static void names() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("George");
        names.add("Elaine");
        names.add("Kramer");

        for (String name : names) {
            System.out.println(names);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i);
        }

        System.out.println(names.get(2));

        names.remove(1);

        for (String name : names) {
            System.out.println(names);
        }

        System.out.println(names.size());
        System.out.println();
    }

    public static void decimals() {
        ArrayList<Double> decimals = new ArrayList<>();
        decimals.add(5.5);
        decimals.add(7.0);
        decimals.add(3.3);
        decimals.add(1.1);

        for (Double decimal : decimals) {
            System.out.println(decimal);
        }

        for (int i = 0; i < decimals.size(); i++) {
            System.out.println(i);
        }

        System.out.println(decimals.get(2));

        decimals.remove(3);

        for (Double decimal : decimals) {
            System.out.println(decimal);
        }

        System.out.println(decimals.size());
        System.out.println();
    }
}
