class Vehicle 
{
    String brand;
    double speed;
    String fuelType;
    double mileage;

    // Static Block
    static 
    {
        System.out.println("System Initialization...");
    }

    // Non-Static Block
    {
        System.out.println("New vehicle Object creatation...");
    }

    Vehicle(String brand, double speed, String fuelType, double mileage) 
    {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    void updateSpeed(double updateSpeed) 
    {
        this.speed = updateSpeed;
    }

    void displayDetails() 
    {
        System.out.println("Brand:"+ brand + "\tSpeed:"+ speed + "\tFuel Type :" + fuelType + "\tMileage: "+ mileage);
    }
}

class Car extends Vehicle 
{
    public Car(String brand, double speed, String fuelType, double mileage) 
    {
        super(brand, speed, fuelType, mileage);
    }
}

class Bike extends Vehicle 
{
    public Bike(String brand, double speed, String fuelType, double mileage) 
    {
        super(brand, speed, fuelType, mileage);
    }
}


class FleetManagementSystem 
{
    public static void main(String[] args) 
    {
        Car c1 = new Car("Hundai", 100.0, "Deisel", 15.5);
        Bike b1 = new Bike("TVS", 75.0, "Petrol", 50.0);

        System.out.println("\n--- Initial Vehicle Status ---");
        c1.displayDetails();
        b1.displayDetails();

        c1.updateSpeed(120.5);
        b1.updateSpeed(90.0);

        System.out.println("\n--- After Update Vehicle Status ---");
        c1.displayDetails();
        b1.displayDetails();
    }
}
