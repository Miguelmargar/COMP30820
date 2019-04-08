package Pract_7;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
        this(1000);
    }

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = 1000;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "id = " + this.getId() + ", balance = " + this.getBalance() + ", date created = " + this.getDateCreated();
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit < amount) {
            System.out.println("Your current balance is: " + this.getBalance() + "Your overdraft limit is: " +
                    this.getOverdraftLimit() + "You have attempted to withdraw: " + amount + ". This transaction cannot be completed. Your balance is unchanged");
        } else {
            this.setBalance(getBalance() - amount);
        }
    }

    @Override
    public double getMonthlyInterest() {
        if (this.getBalance() <= 0) {
            return 0;
        } else {
            return this.getBalance() * Account.getAnnualInterestRate() / 12;
        }
    }
}
