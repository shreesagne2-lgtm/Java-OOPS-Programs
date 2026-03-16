class Bank {
    final double interestRate = 5.0;

    void calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        System.out.println("Interest for amount " + amount + " is: " + interest);
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.calculateInterest(10000);
        b.calculateInterest(20000);
        b.calculateInterest(50000);
    }
}