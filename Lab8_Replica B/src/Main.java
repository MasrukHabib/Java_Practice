//LAB 8 Replica:
//
//b.	Develop a Java program to simulate a bank account management system. Define an abstract class Account with the following attributes and methods:
//Attributes: accountNumber (integer), accountHolder (String), balance (double)
//Methods: Abstract method calculateInterest() to calculate the interest for the account. Method    displayInfo() to display the account information including account number, account holder, balance, and calculated interest.
//Implement two concrete subclasses of Account: SavingsAccount and CheckingAccount.
//•	SavingsAccount should have an additional attribute interestRate (double) and should implement the calculateInterest() method to calculate interest based on the balance and interest rate.
//•	CheckingAccount should have an additional attribute overdraftLimit (double) and should implement the calculateInterest() method to calculate interest based on the balance and a fixed rate.
//In the main() method:
//        •	Create an object of class SavingsAccount with account number 1001, account holder "Alice", balance $5000, and interest rate 0.05.
//        •	Create an object of class CheckingAccount with account number 1002, account holder "Bob", balance $3000, and overdraft limit $500.
//•	Display the information about each account using the displayInfo() method.

abstract class Account {
    int accountNumber;
    String accountHolder;
    double balance;

    abstract double calculateInterest();

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        // Assume interest for savings account is the product of balance and interest rate
        return balance * interestRate;
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    CheckingAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    double calculateInterest() {
        // Assume interest for checking account is a fixed rate of $20
        return 20;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(1001, "Alice", 5000, 0.05);
        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount(1002, "Bob", 3000, 500);

        // Display information about each account
        System.out.println("Savings Account details:");
        savingsAccount.displayInfo();
        System.out.println();
        System.out.println("Checking Account details:");
        checkingAccount.displayInfo();
        System.out.println("\n name: \n Enrollment:  \n Section: \n lab-batch: ")
    }
}
