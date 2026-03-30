class Product 
{
    String id;
    String name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    void updatePrice(int discountPercent) 
    {
        this.price -= (this.price * discountPercent / 100.0);
    }

    void updateStock(int amount) 
    {
        this.quantity += amount;
    }

    double getStockValue() 
    {
        return price * quantity;
    }

    void display() 
    {
        System.out.println("Product ID: "+ id);
        System.out.println("Product Name: "+ name);
        System.out.println("Product Price: "+ price);
        System.out.println("Product Quantity: "+ quantity);
        System.out.println("Product Stock Update: "+ getStockValue());
    }
}

class ProductInventrySystem {
    public static void main(String[] args) 
    {
        Product[] inventory = new Product[3];

        inventory[0] = new Product("1", "Paints", 2000.0, 100);
        inventory[1] = new Product("2", "Primer", 400.0, 40);
        inventory[2] = new Product("3", "Fillers", 120.0, 150);

        inventory[0].updateStock(20);
        inventory[1].updatePrice(15);
        inventory[2].updatePrice(10);

        double totalInventoryValue = 0;

        System.out.println("=============Product Inventory=============");
        for (Product p : inventory) {
            if (p != null) {
                p.display();
                totalInventoryValue += p.getStockValue();
            }
        }
        System.out.println("-------------------------");
        System.out.println("Total Inventory Value: "+ totalInventoryValue);
    }
}
