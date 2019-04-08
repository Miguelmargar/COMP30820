package Pract_7;
import java.util.Date;

public class Account {

    private static double annualInterestRate = 0; // The annual interest rate - applies to all accounts
    private int id; // The account id
    private double balance; // The account balance
    private Date dateCreated; // The date this account is created

    // Construct an account and set the date of creation
    public Account() {
        this(0, 0);
    }

    // Construct an account and set the id and balance and set the date of creation
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // Return the annual interest rate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Set a new annual interest rate
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // Return the id
    public int getId() {
        return id;
    }

    // Set a new id
    public void setId(int id) {
        this.id = id;
    }

    // Return the balance
    public double getBalance() {
        return balance;
    }

    // Set a new balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Return the date of creation
    public Date getDateCreated() {
        return dateCreated;
    }

    // Return the monthly interest amount
    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    // Withdraw the amount specified
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Deposit the amount specified
    public void deposit(double amount) {
        balance += amount;
    }

    // Return a String representation
    @Override
    public String toString() {
        return "id = " + id + ", balance = " + balance + ", date created = " + dateCreated;
    }
}

