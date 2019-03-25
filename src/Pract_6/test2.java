package Pract_6;

public class test2 {
    public static void main(String[] args) {
        Question_2 c = new Question_2(1122, 20000);
        Question_2.setAnnualInterestRate(0.045);
        c.withdraw(2500);
        c.deposit(3000);
        System.out.println("Balance is: " + c.getBalance() + "\nmonthly interest amount: " + c.getMonthlyInterest() + "\nDate created:" + c.getDateCreated());
    }
}
