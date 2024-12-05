import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Bank bank = new Bank();

    public void displayMenu() {
        while (true) {
            System.out.println("******** MENU ********");
            System.out.println();
            System.out.println("Please make a selection: ");
            System.out.println("1) Access Account");
            System.out.println("2) Open a New Account");
            System.out.println("3) Close All Accounts");
            System.out.println("4) Exit");
            System.out.print("-->");
            String input = scn.nextLine();

            if (input.equals("1") || input.equalsIgnoreCase("one")) {
                accessAccount();
            }

            else if (input.equals("2") || input.equalsIgnoreCase("two")) {
                openNewAccount();
            }

            else if (input.equals("3") || input.equalsIgnoreCase("three")) {
                closeAllAccounts();
            }

            else if (input.equals("4") || input.equalsIgnoreCase("four")) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.err.println("Invalid entry, please try again.");
            }
        }
    }

    public void accessAccount() {
        System.out.println("Please enter PIN: ");
        int userPIN = Integer.parseInt(scn.nextLine());
        if (bank.getCustomer(userPIN) == null) {
            System.err.println("Invalid PIN.");
        } else {
            Customer customer = bank.getCustomer(userPIN);
            customer.getAllAccounts();
            System.out.println();
            System.out.println("***** Active Accounts *****");
            System.out.println("Which account would you like to access?: ");
            int accountAccessNum = Integer.parseInt(scn.nextLine());
            System.out.println();

            if (customer.getAccount(accountAccessNum) == null) {
                System.err.println("Account number invalid.");
                return;
            } else {
                while (true) {
                    Account a = customer.getAccount(accountAccessNum);
                    System.out.println("Please make a selection: ");
                    System.out.println();
                    System.out.println("1) Make a deposit");
                    System.out.println("2) Make a withdrawal");
                    System.out.println("3) See account balance");
                    System.out.println("4) Close account");
                    System.out.println("5) Exit");
                    System.out.print("-->");
                    String input2 = scn.nextLine();

                    if (input2.equals("1") || input2.equalsIgnoreCase("one")) {
                        //deposit
                        System.out.print("Enter amount of money you would like to deposit: ");
                        int deposit = Integer.parseInt(scn.nextLine());
                        a.deposit(deposit);
                    }

                    else if (input2.equals("2") || input2.equalsIgnoreCase("two")) {
                        //withdraw
                        System.out.print("Enter amount of money you would like to withdraw: ");
                        int withdrawal = Integer.parseInt(scn.nextLine());
                        a.withdraw(withdrawal);
                    }

                    else if (input2.equals("3") || input2.equalsIgnoreCase("three")) {
                        //see account balance
                        System.out.println(a.toString());
                    }

                    else if (input2.equals("4") || input2.equalsIgnoreCase("four")) {
                        //close account
                        customer.removeAccount(a);
                        System.out.println("Account " + a + " removed successfully.");
                        break;
                    }

                    else if (input2.equals("5") || input2.equalsIgnoreCase("five")) {
                        //exit
                        return;
                    }
                    else {
                        System.err.println("Invalid entry, please try again.");
                    }
                }
            }
        }
    }

        public void openNewAccount() {
            System.out.println("Are you a new customer?");
            System.out.println("Please enter 'Y' for yes or 'N' for no: ");
            String userInput = scn.nextLine();
            if (userInput.equalsIgnoreCase("Y")) {
                System.out.println("Please enter your first name: ");
                String firstName = scn.nextLine();
                System.out.println("Please enter your last name: ");
                String lastName = scn.nextLine();
                System.out.println("Please create a 4-digit PIN: ");
                int pin = Integer.parseInt(scn.nextLine());
                Customer customer = new Customer(firstName, lastName, pin);
                bank.addCustomer(pin, customer);

                System.out.println("Please enter initial deposit amount: ");
                int depAmnt = Integer.parseInt(scn.nextLine());
                int actNum = Account.numberOfAccounts;
                Account a = new Account(depAmnt, actNum);
                customer.addAccount(a);
                System.out.println("New account opened: " + actNum);
                System.out.println();
            } else if (userInput.equalsIgnoreCase("N")) {
                System.out.println("Please enter your PIN: ");
                int pin = Integer.parseInt(scn.nextLine());
                if (bank.getCustomer(pin) == null) {
                    System.err.println("Invalid PIN.");
                } else {
                    Customer customer = bank.getCustomer(pin);
                    System.out.println("Please enter initial deposit amount: ");
                    int depAmnt = Integer.parseInt(scn.nextLine());
                    int actNum = Account.numberOfAccounts;
                    Account a = new Account(depAmnt, actNum);
                    customer.addAccount(a);
                    System.out.println("New account opened: " + actNum);
                }
                System.out.println();
            }
        }

        public void closeAllAccounts() {
            System.out.println("Please enter your PIN to close all active accounts: ");
            int pin = Integer.parseInt(scn.nextLine());
            bank.removeCustomer(pin);
            System.out.println("All accounts closed, customer removed from bank database.");
        }
}
