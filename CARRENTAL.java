import java.util.Scanner;

class CARRENTAL {

    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {

        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        }

        else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        }

        else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        }

        else {
            Rent = 0;
            System.out.println("Invalid Car Type");
        }

        return Rent;
    }

    void ShowCar() {
        System.out.println("\nCar Details");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CARRENTAL c = new CARRENTAL();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        c.GetCar(id, type);
        c.GetRent();
        c.ShowCar();
    }
}