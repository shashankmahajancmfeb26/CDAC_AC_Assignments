class Ticket {
    int ticketid;
    String name;
    String source;
    String destination;
    double fare;

    Ticket(int id, String name, String source, String destination, double fare) {
        this.ticketid = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    void updateFare(double newFare) {
        this.fare = newFare;
        System.out.println("Fare updated for Ticket ID: " + ticketid);
    }

    void displayTicket() {
        System.out.println("Ticket ID: " + ticketid); 
        System.out.println("Passenger Name: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket IFare Rs. : " + fare);
    }
}

class TransportTicketSystem {
    public static void main(String[] args) {
        Ticket[] T = new Ticket[5];
        int totalTickets = 0;

        T[0] = new Ticket(101, "Chetan", "Jalgoan", "Pune", 1000.0);
        totalTickets++;
        
        T[1] = new Ticket(102, "Rohan", "Savda", "Mumbai", 800.0);
        totalTickets++;

        T[2] = new Ticket(103, "Nitin", "Bhusawal", "Vadodara", 700.0);
        totalTickets++;
        
        T[0].updateFare(1250.0);

        double totalRevenue = 0;
        System.out.println("============ All Ticket Bookings ============");
        for (int i = 0; i < totalTickets; i++) {
            T[i].displayTicket();
            totalRevenue += T[i].fare;
            System.out.println("-----------------------------------------");
        }

        System.out.println("Total Tickets Booked: " + totalTickets);
        System.out.println("Total Fare Collected: Rs. " + totalRevenue);
        System.out.println("=============================================");
    }
}
