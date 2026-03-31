class Reservation {

    int seats = 2;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + " is booking ticket...");
            seats--;
            System.out.println("Ticket booked successfully for " + name);
        } else {
            System.out.println("No tickets available for " + name);
        }
    }
}

class Passenger extends Thread {

    Reservation r;
    String name;

    Passenger(Reservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        Passenger p1 = new Passenger(r, "A");
        Passenger p2 = new Passenger(r, "B");
        Passenger p3 = new Passenger(r, "C");

        p1.start();
        p2.start();
        p3.start();
    }
}