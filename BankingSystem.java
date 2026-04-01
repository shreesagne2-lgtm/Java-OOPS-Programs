class BankingSystem {
    private int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem();

        Thread t1 = new Thread(() -> account.withdraw(700), "User1");
        Thread t2 = new Thread(() -> account.withdraw(500), "User2");

        t1.start();
        t2.start();
    }
}