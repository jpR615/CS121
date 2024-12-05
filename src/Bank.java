import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    //list of customers
    HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
    Scanner scn = new Scanner(System.in);

    //methods
    protected void addCustomer(int pin, Customer customer) {
        customers.put(pin, customer);
    }

    protected void removeCustomer(int pin, Customer customer) {
        customers.remove(pin, customer);
    }

    protected void removeCustomer(int pin) {
        customers.remove(pin);
    }

    //get customer by pin method
    protected Customer getCustomer(int pin) {
        return customers.get(pin);
    }

    protected String getAllCustomers() {
        return customers.toString();
    }
}
