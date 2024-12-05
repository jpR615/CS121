package weekEleven.arrayListDemo;
import java.util.Scanner;
import java.util.ArrayList;


public class customerInfo {
    public static void getCustomerInfo() {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> info = new ArrayList<>();

        boolean isTrue = true;
        while (isTrue) {
            String[] array1 = new String[]{"Enter your course name: ", "Enter your GPA: ", "Enter your score: ", "Enter your letter grade: "};
            System.out.println("Enter your information or press 'q' to quit");

            for (String i : array1) {
                System.out.print(i);
                String input = scn.nextLine();
                if (input.equals("q")) {
                    isTrue = false;
                    break;
                }
                else {
                    info.add(input);
                }
            }
        }
        System.out.println(info);
    }
}

            /*
            System.out.print("Enter your course name: ");
            String input1 = scn.nextLine();
            if (input1.equals("q")) {
                isTrue = false;
            }
            else {
                info.add(input1);
            }

            System.out.print("Enter your GPA: ");
            String input2 = scn.nextLine();
            if (input2.equals("q")) {
                isTrue = false;
            }
            else {
                info.add(input2);
            }


            System.out.print("Enter your score: ");
            String input3 = scn.nextLine();
            if (input3.equals("q")) {
                isTrue = false;
            }
            else {
                info.add(input3);
            }

            System.out.print("Enter your letter grade: ");
            String input4 = scn.nextLine();
            if (input4.equals("q")) {
                isTrue = false;
            }
            else {
                info.add(input4);
            }

            System.out.println(info);
        }
    }
}
             */
