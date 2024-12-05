import java.util.ArrayList;

public class Customer {
    //instance variables
    String firstName, lastName;
    int pin;
    ArrayList<Account> accountsList = new ArrayList<Account>();

    //constructors
    //new customer constructor
    public Customer(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPIN() {
        return pin;
    }

    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }

    public void addAccount(Account account) {
        accountsList.add(account);
    }

    public void removeAccount(Account account) {
        accountsList.remove(account);
    }

    public ArrayList<Account> getAllAccounts() {
        for (int i = 0; i < accountsList.size(); i++) {
            System.out.println(accountsList.get(i));
        }
        return accountsList;
    }

    public Account getAccount(int actNum) {
        Account foundAccount = null;
        for (Account account : accountsList) {
            if (account.getAccountNum() == actNum) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    @Override
    public String toString() {
        return String.format("Name: %s + %s\n" + "PIN: %d\n", firstName, lastName, pin);
    }
}
