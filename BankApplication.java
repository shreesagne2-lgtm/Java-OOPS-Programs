public class BankApplication {

    static void processTransaction() throws Exception {
        // Simulating transaction
        boolean error = false;

        if (error) {
            throw new Exception();
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {

        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}