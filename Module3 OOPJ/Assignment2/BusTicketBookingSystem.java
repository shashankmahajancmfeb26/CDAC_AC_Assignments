import java.util.Scanner;
class BusTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10]; 
        int ch;

        System.out.println("--- Welcome to Bus Seat Booking ---");

        do {
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Seat Status (1 to 10): ");
                    for (int i=0;i<seats.length;i++) {
                        String status = seats[i] ? "Booked" : "Available";
                        System.out.println("Seat " + (i + 1) + ": " + status);
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number to book (1 to 10): ");
                    int bookNum = sc.nextInt();
                    if (bookNum<1 || bookNum>10) {
                        System.out.println("Invalid Seat Number....");
                    } else if (seats[bookNum-1]) {
                        System.out.println("Sorry, Seat " + bookNum + " is already Booked.");
                    } else {
                        seats[bookNum-1] = true;
                        System.out.println("Seat " + bookNum + " Booked Successfully...");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel (1 to 10): ");
                    int cancelNum = sc.nextInt();
                    if (cancelNum<1 || cancelNum>10) {
                        System.out.println("Invalid seat number!");
                    } else if (!seats[cancelNum-1]) {
                        System.out.println("Seat " + cancelNum + " is already empty.");
                    } else {
                        seats [cancelNum-1] = false;
                        System.out.println("Booking for seat " + cancelNum + " cancelled.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Choice, Please Try again....");
            }
        } while (ch != 4);

        sc.close();
    }
}
