package weekFive;
import java.util.Scanner;
import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] array1, array2, array3, array4;
        int i;
        System.out.println("Enter number of array elements: ");
        final int NUMBER_OF_ARRAY_ELEMENTS = Integer.parseInt(scn.nextLine());
        array1 = new int[NUMBER_OF_ARRAY_ELEMENTS];
        array2 = new int[NUMBER_OF_ARRAY_ELEMENTS];
        array3 = new int[NUMBER_OF_ARRAY_ELEMENTS];
        array4 = new int[NUMBER_OF_ARRAY_ELEMENTS];
        for (i = 0; i < NUMBER_OF_ARRAY_ELEMENTS; i++) {
            System.out.println("Enter array element " + i + ": ");
            array1[i] = Integer.parseInt(scn.nextLine());
        }
        for (i = 0; i < NUMBER_OF_ARRAY_ELEMENTS; i++) {
            array2[i] = array1[i];
        }
        for (i = 0; i < NUMBER_OF_ARRAY_ELEMENTS; i++) {
            array3[i] = array1[i] * array1[i];
        }
        for (i = NUMBER_OF_ARRAY_ELEMENTS - 1; i >= 0; i--){
            array4[i] = array1[NUMBER_OF_ARRAY_ELEMENTS - 1 - i];
        }

        System.out.println("Array 2 - copy");
        System.out.println(Arrays.toString(array2));

        System.out.println();

        System.out.println("Array 3 - squared");
        System.out.println(Arrays.toString(array3));

        System.out.println();

        System.out.println("Array 4 - reversed");
        System.out.println(Arrays.toString(array4));

    }
}
