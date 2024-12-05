package weekFourteen;

public class BigONotes {
    public static void main(String[] args) {
        //26 students
        String[] students = {"Alice", "Bob", "Charlie", "David", "Ella", "Frank", "Grace", "Hannah", "Ian", "Jack",
                "Katie", "Luke", "Mona", "Nate", "Olivia", "Paul", "Quinn", "Rachel", "Steve", "Tina", "Uma", "Victor",
                "Wendy", "Xander", "Yara", "Zane"};

        //26 students -->, maximum of 5 comparisons
        //2 ^ 5 = 32
        //2 ^ 4 = 16

        printOneTime("Billy");
        binarySearch(students, "Nate");
        printNTimes(students);
    }
    //Big O describes the  performance or complexity of an algorithm.
    //Time complexity - the time it takes to run as function of the size of the input.
    //Space complexity - the space it requires.
    //Focus on the maximum amount of time or space that your algorithm takes.

    //(0)1 - constant time --> doesn't change off of increasing input
    public static void printOneTime(String name) {
        System.out.println(name);
    }

    //0(log n) - Logarithmic time - the execution time will grow logarithmically with the input size.
    public static int binarySearch(String[] array, String value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = value.compareTo(array[mid]);

            if (result == 0) {
                return mid;
            }

            else if (result > 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1; //value not found
    }

    //O(n) - Linear time - execution grows linearly with the input size
    public static void printNTimes(String[] array) {
        for(String name : array) {
            System.out.println(name);
        }
    }
}
