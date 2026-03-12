// Define a class Resort with members and functions Compute(), Getinfo() and DispInfo()

import java.util.Scanner;

class Resort {

    int RNo;
    String Name;
    float Charges;
    int Days;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = 1.02f * amount;
        }
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();

        System.out.print("Enter Customer Name: ");
        Name = sc.next();

        System.out.print("Enter Per Day Charges: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        float amount = Compute();

        System.out.println("\n---- Resort Details ----");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Per Day Charges: " + Charges);
        System.out.println("Days of Stay: " + Days);
        System.out.println("Total Amount: " + amount);
    }

    public static void main(String[] args) {

        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}