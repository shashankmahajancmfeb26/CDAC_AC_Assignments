class Order 
{
    int orderid;
    String name;
    String[] items;
    double[] prices;
    int itemCount;

    Order(int id, String name, int maxItems)
    {
        this.orderid = id;
        this.name = name;
        this.items = new String[maxItems];
        this.prices = new double[maxItems];
        this.itemCount = 0;
    }

    // Method to add items to the order
    void addItem(String itemName, double itemPrice)
    {
        if (itemCount < items.length) {
            items[itemCount] = itemName;
            prices[itemCount] = itemPrice;
            itemCount++;
        }
    }

    void displayBill()
    {
        double subTotal = 0;
        System.out.println("--- Order Bill ---");
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer: " + name);
        System.out.println("Items Purchased:");
        
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i+1) +". " + items[i] + ": Rs. " + prices[i]);
            subTotal += prices[i];
        }

        double gst = subTotal * 0.18;
        double finalBill = subTotal + gst;

        System.out.println("Sub-total: Rs." + subTotal);
        System.out.println("GST (18%): Rs." + gst);
        System.out.println("Final Amount: Rs." + finalBill);
        System.out.println("---------------------------");
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) 
    {
        Order order1 = new Order(101, "Kushal", 5);

        order1.addItem("Laptop", 60000);
        order1.addItem("Mouse", 200);
        order1.addItem("Keyboard", 500);

        order1.displayBill();

        Order order2 = new Order(102, "Diksha", 3);
        order2.addItem("Mobile", 15000);
        order2.addItem("Speaker", 5000);
        order2.displayBill();
    }
}
