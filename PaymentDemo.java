abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card.");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI.");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Net Banking.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(5000);

        p = new UPIPayment();
        p.pay(2000);

        p = new NetBankingPayment();
        p.pay(3500);
    }
}