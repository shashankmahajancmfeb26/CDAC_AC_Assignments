import java.util.Scanner;

interface Payment 
{
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Processing UPI payment of Rs. " + amount + " Payement Successful....");
    }
    public void refund(double amount)
    {
        System.out.println("Refunding Rs. " + amount + " to Customer.");
    }
}

class CardPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Processing Card payment of Rs. " + amount + " Payment Successful...");
    }
    public void refund(double amount)
    {
        System.out.println("Refunding Rs. " + amount + " to Customer.");
    }
}

class Product
{
    int prodId;
    String prodName;
    String price;

    Product(int Id, String Name, String price)
    {
        this.prodId = Id;
        this.prodName = Name;
        this.price = price;
    }

    double convertPrice() throws NumberFormatException
    {
        return Double.parseDouble(price);
    }
}

class Order
{
    String customerName;
    Product[] products;

    Order(String customerName, Product[] products)
    {
        this.customerName = customerName;
        this.products = products;
    }

    double calculateTotal()
    {
        double total = 0;
        for (Product p : products)
        {
            total += p.convertPrice();
        }
        return total;
    }

    public double calculateTotal(double discountPercentage) {
        double total = calculateTotal();
        return total - (total * (discountPercentage / 100));
    }

    public String generateBill(double finalAmount) {
        StringBuilder bill = new StringBuilder();
        bill.append("\n------- Bill -------\n");
        bill.append("Customer: ").append(customerName).append("\n");
        bill.append("Items List:\n");
        for (Product p : products) {
            bill.append("- ").append(p.prodName).append(" : Rs").append(p.price).append("\n");
        }
        bill.append("----------------------------------\n");
        bill.append("Total Payable: Rs. ").append(finalAmount).append("\n");
        bill.append("----------------------------------\n");
        return bill.toString();
    }
}

class OnlineShoppingSystem 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("How many products: ");
            int count = Integer.parseInt(sc.nextLine());

            if (count <= 0) throw new IllegalArgumentException("Invalid Product Count");

            Product[] products = new Product[count];

            for (int i = 0; i < count; i++)
            {
                System.out.print("Enter ID for product " + (i + 1) + ": ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Name: ");
                String Name = sc.nextLine();
                System.out.print("Enter Price: ");
                String price = sc.nextLine();
                
                products[i] = new Product(id, Name, price);
                products[i].convertPrice(); 
            }

            Order order = new Order(name, products);
            
            System.out.print("Enter discount %: ");
            double discount = Double.parseDouble(sc.nextLine());
            double finalAmount = order.calculateTotal(discount);

            System.out.println(order.generateBill(finalAmount));

            System.out.println("Select Payment: 1. UPI  2. Card");
            int choice = Integer.parseInt(sc.nextLine());

            Payment payment;
            if (choice == 1)
            {
                payment = new UPIPayment();
            } 
            else if (choice == 2) 
            {
                payment = new CardPayment();
            } 
            else
            {
                throw new Exception("Invalid Payment Option");
            }

            payment.pay(finalAmount);

        } catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid numeric input/price format.");
        } catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
