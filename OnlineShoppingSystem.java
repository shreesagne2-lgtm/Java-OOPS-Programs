class Payment extends Thread {
    public void run() {
        System.out.println("Processing payment...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Payment interrupted");
        }
    }
}

class Order extends Thread {
    public void run() {
        System.out.println("Order confirmed...");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Payment p = new Payment();
        Order o = new Order();

        p.start();
        try {
            p.join(); // wait until payment is done
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        o.start();
    }
}