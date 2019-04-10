package Pract_7;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            // don't need to call the super.getBalance() as dinamic binding picks it up by going
            // through the chain of inheritance and it finds it in Account class.
            System.out.println("Your current balance is: " + getBalance() + "You have " +
                    "attempted to " +
                            "withdraw: " + amount + "This transaction cannot be completed. " +
                    "Your balance is unchanged");
        } else {
            // use super here as otherwise it would call itself and create a loop rather than use
            // the super class withdraw function
            super.withdraw(amount);
        }

    }
}
