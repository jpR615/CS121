package weekFourteen;

public class BigO {
    //(0)1 - constant time --> doesn't change off of increasing input
    public static void printOneTime(String name) {
        System.out.println(name);
    }

    //O(n) - Linear time - execution grows linearly with the input size
    public static void printNTimes(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("#" + (count + 1) + "Internet Historian");
            count++;
        }
        System.out.println();
    }

    //O(n^2) - Quadratic Time - the execution time grows quadratically with the input size
    public static void printNSquaredTimes(int n) {
        int count = 0;
        for (int i = 1; i <=n; i ++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("#" + (count + 1) + ":" + "The nested for loop count" +
                        " i.   " + i + "The magicians" + "j   " + j + "\n");
            }
        }
    }

}
