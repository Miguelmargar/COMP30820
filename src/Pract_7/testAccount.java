package Pract_7;

public class testAccount {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(100);
        s.withdraw(50);
        System.out.println(s.getBalance());
        Account.setAnnualInterestRate(10);
        System.out.println(s.getMonthlyInterest());

        System.out.println();

        CheckingAccount c = new CheckingAccount();
        c.deposit(100);
        c.withdraw(50);
        System.out.println(c.getBalance());
        System.out.println(c.getMonthlyInterest());

    }

}
