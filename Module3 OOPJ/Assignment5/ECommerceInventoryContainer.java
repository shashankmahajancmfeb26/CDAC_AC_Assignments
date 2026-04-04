class Inventory<T>
{
    T product;

    void addProduct(T product)
    {
        this.product = product;
    }

    T getProduct()
    {
        return this.product;
    }

    void display()
    {
        if (product != null)
        {
            System.out.println(product.toString());
        } 
        else
        {
            System.out.println("Inventory is empty.");
        }
    }
}
class Electronics
{
    private String name;
    private String brand;

    Electronics(String name, String brand)
    {
        this.name = name;
        this.brand = brand;
    }

    public String toString()
    {
        return "Electronics: Prduct Name: " + name + ", Brand Name : " + brand;   
    }
}

class Clothing
{
    private String name;
    private String size;

    Clothing(String name, String size)
    {
        this.name = name;
        this.size = size;
    }

    public String toString()
    {
        return "Clothing: Product Name: " + name + ", Size: " + size;
    }
}
class ECommerceInventoryContainer
{
    public static void main(String[] args)
    {
        Inventory<Electronics> e = new Inventory<>();
        Electronics laptop = new Electronics("POCO X6 Pro", "Xiomi");
        e.addProduct(laptop);
        System.out.println("Retrieved: ");
        e.display();

        Inventory<Clothing> c = new Inventory<>();
        Clothing shirt = new Clothing("H&M", "Medium");
        c.addProduct(shirt);
        System.out.println("Retrieved: ");
        c.display();
    }
}
