package weekFour;

public class CFTable {
    public static void main(String[] args) {
        int i;
        System.out.println("Celsius" + "\t\t" + "Fahrenheit");
        System.out.println("**********************");
        for (i = 0; i <= 20; i++) {
            double temp = ((1.8 * i) + 32);
            System.out.printf("%d\t\t\t%.1f\n",i,temp);
        }
    }
}
