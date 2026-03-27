import java.util.Scanner;

class RestaurantManagement 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subtotal = 0;
        boolean ordering = true;

        while (ordering) 
            {
            System.out.println("Menu:");
            System.out.println("1. Pizza         - Rs. 200");
            System.out.println("2. Burger        - Rs. 150");
            System.out.println("3. French Fries  - Rs. 100");
            System.out.println("4. Coke          - Rs. 40");
            System.out.println("5. Generate Bill ");
            System.out.print("Enter your choice: ");
            
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Added Burger to cart.");
                    subtotal += 200;
                    break;
                case 2:
                    System.out.println("Added Pizza to cart.");
                    subtotal += 150;
                    break;
                case 3:
                    System.out.println("Added Pasta to cart.");
                    subtotal += 100;
                    break;
                case 4:
                    System.out.println("Added Coke to cart.");
                    subtotal += 40;
                    break;
                case 5:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice, Please try again....");
            }
        }
        double gst = subtotal * 0.05;
        double finalBill = subtotal + gst;

        System.out.println("============= Food Bill =============");
        System.out.println("Subtotal:      Rs. " + subtotal);
        System.out.println("GST (5%):      Rs. " + gst);
        System.out.println("-----------------------------");
        System.out.println("Total Amount:  Rs. " + finalBill);
        System.out.println("===============================");
        System.out.println("Thank you, Come again");
    }
}
