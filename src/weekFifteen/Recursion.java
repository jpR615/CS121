package weekFifteen;

public class Recursion {

    public static void countDown(int num) {
        if (num == 0) {
            System.out.println("Blast off!");
        }

        else {
            System.out.println(num);
            countDown(num - 1);
        }
    }

    public static void alphaBackwards(char letter) {
        if (letter == 'a') {
            System.out.println(letter);
        }
        else {
            System.out.println(letter);
            alphaBackwards((char)(letter - 1));
        }
    }
}
