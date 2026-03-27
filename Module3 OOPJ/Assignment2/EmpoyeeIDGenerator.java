class Employee {
    static int counter = 1000; 
    int empid;
    String name;
    String dept;

    // Constructor
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
            
        counter++; 
        this.empid = counter;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " +empid); 
        System.out.println("Employee Name: " +name); 
        System.out.println("Employee Department: " +dept);
    }
}
class EmpoyeeIDGenerator{
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Sumit", "Training");
        Employee e2 = new Employee("Manish", "Marketing");
        Employee e3 = new Employee("Pavan", "Sales");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        
        System.out.println("-----------------------------");
        System.out.println("Total Employees Processed: " + (Employee.counter - 1000));
    }
}
