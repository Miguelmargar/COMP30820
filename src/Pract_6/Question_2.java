package Pract_6;

import java.util.Date;

public class Question_2 {
    private int id;
    private int balance;
    private Date dateCreated;
    private static double annualInterestRate;

    // Construct account with defaults
    public Question_2() {
        this(0, 0 );
    }

    // creates object with specified values
    public Question_2(int id, int balance) {
        this.id = id;
        this.balance = balance;
        Date d = new Date();
        this.dateCreated = new Date();
    }
// getters ----------------------------------------
    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public static double get_annualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

//  Setters ----------------------------------------
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Question_2.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    public void withdraw(int amt) {
        this.balance -= amt;
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public String toString() {
        return "ID is: " + id + "balance is: " + "Date Created is: " + dateCreated;
    }
}
