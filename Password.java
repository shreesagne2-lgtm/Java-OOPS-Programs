import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Mask all except last 2 characters
        int length = password.length();

        if (length > 2) {
            String maskedPart = password.substring(0, length - 2).replaceAll(".", "*");
            String visiblePart = password.substring(length - 2);
            String maskedPassword = maskedPart + visiblePart;

            System.out.println("Masked Password: " + maskedPassword);
        } else {
            System.out.println("Password too short to mask properly!");
        }

        sc.close();
    }
}