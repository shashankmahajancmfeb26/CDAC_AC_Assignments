import java.util.Scanner;

class GroceryStoreBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Items for Billing: ");
        int n = sc.nextInt();

        // Arrays to store item details
        String[] itemName = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];
        double[] itemTotal = new double[n];

        double subtotal = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("Name: ");
            itemName[i] = sc.nextLine();
            System.out.print("Quantity: ");
            qty[i] = sc.nextInt();
            System.out.print("Price per Unit: ");
            price[i] = sc.nextDouble();

            itemTotal[i] = qty[i] * price[i];
            subtotal += itemTotal[i];
        }

        // Discount
        double discount = 0;
        if (subtotal > 3000) {
            discount = subtotal * 0.10;
        }
        double finalBill = subtotal - discount;

        // Final Bill Printing
        System.out.println("=============== GROCERY BILL ================");
        System.out.println("Item"+"\tQty"+"\tPrice"+"\tTotal");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.println(itemName[i]+"\t"+qty[i]+"\t"+price[i]+"\t"+itemTotal[i]);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Subtotal:        Rs. "+ subtotal);
        System.out.println("Discount (10%%):  Rs. "+ discount);
        System.out.println("Final Amount:    Rs. "+ finalBill);
        System.out.println("===============================================");
    }
}
