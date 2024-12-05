public class Account {
    //instance variables
    private int balance, actNum;
    static int numberOfAccounts = 1000;

    //constructors
    //new account constructor
    public Account(int deposit, int actNum) {
        this.balance = deposit;
        this.actNum = actNum;
        numberOfAccounts ++;
    }

    public Account(int actNum) {
        this.actNum = actNum;
    }

    public int getAccountNum() {
        return actNum;
    }

    public int getBalance() {
        return balance;
    }

    //methods
    protected void deposit(int amount) {
        System.out.println("Amount deposited: $" + amount);
        balance = balance + amount;
        System.out.println("Balance: $" + balance);
    }

    protected void withdraw(int amount) {
        if (amount > balance) {
            System.err.println("Insufficient funds.");
        }

        else {
            System.out.println("Amount withdrawn: " + amount);
            balance = balance - amount;
            System.out.println("Balance: $" + balance);
        }
    }

    @Override
    public String toString() {
        return String.format("Account number: %s\n" + "Balance: $%d\n", actNum, balance);
    }
}
