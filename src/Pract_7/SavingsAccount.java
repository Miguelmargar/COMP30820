package Pract_7;

public class SavingsAccount extends Account {

    @Override
    public void withdraw(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("Your current balance is: " + this.getBalance() + "You have attempted to " +
                            "withdraw: " + amount + "This transaction cannot be completed. " +
                    "Your balance is unchanged");
        } else {
            this.setBalance(this.getBalance() - amount);
        }

    }
}
