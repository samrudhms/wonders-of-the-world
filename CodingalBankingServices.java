
import java.util.Scanner;


class BankAccount {

    protected String customerName;
    protected String accountNumber;
    protected double balance;

    
    public BankAccount(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Amount Rs." + amount + " deposited successfully!");
        } else {
            System.out.println(" Invalid deposit amount!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Amount Rs." + amount + " withdrawn successfully!");
        } else {
            System.out.println(" Insufficient balance or invalid amount!");
        }
    }

    
    public void checkBalance() {
        System.out.println(" Current Balance: Rs." + balance);
    }
}


class CodingalBankAccount extends BankAccount {

    public CodingalBankAccount(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
    }

    
    public void welcome() {
        System.out.println(" Welcome to Codingal Banking Services, " + customerName + "!");
        System.out.println("Your Account Number: " + accountNumber);
        System.out.println("Your Starting Balance: Rs." + balance + "");
    }
}

public class CodingalBankingServices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Codingal Banking Services ");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter initial deposit amount: Rs.");
        double initial = sc.nextDouble();

       
        CodingalBankAccount account = new CodingalBankAccount(name, accNo, initial);
        account.welcome();

        int choice;
        do {
            System.out.println("==== Codingal Banking Menu ====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: Rs.");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: Rs.");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println(" Thank you for using Codingal Banking Services!");
                    break;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
