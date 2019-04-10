package Pract_7;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
        this(0, 0);
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
        double overdraftLimit = 1000;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "id = " + getId() + ", balance = " + getBalance() + ", date created = " + getDateCreated();
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit < amount) {
            System.out.println("Your current balance is: " + getBalance() + "Your overdraft limit is: " +
                    getOverdraftLimit() + "You have attempted to withdraw: " + amount + ". This transaction cannot be completed. Your balance is unchanged");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public double getMonthlyInterest() {
        return (getBalance() <= 0) ? super.getMonthlyInterest() : 0;

    }
}
