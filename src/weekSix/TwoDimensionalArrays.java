package weekSix;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 2.2;
        array2[0][2] = 3.3;
        array2[1][0] = 4.4;
        array2[1][1] = 5.5;
        array2[1][2] = 6.6;
        array2[2][0] = 7.7;
        array2[2][1] = 8.8;
        array2[2][2] = 9.0;
        array2[3][0] = 10.0;
        array2[3][1] = 11.1;
        array2[3][2] = 12.2;

        String[][] array3 = new String[][]{{"Ann"},{"Andy"},{"Andrea"},{"John"},{"Joan"},{"Joana"}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }
        }

        for (double [] row: array2) {
            for (double column: row) {
                System.out.println(column);
            }
        }


        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.println(array3[i][j]);
            }
        }

    }
}
