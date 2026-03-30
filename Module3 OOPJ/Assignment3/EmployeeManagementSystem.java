class Employee {
    int id;
    String name;
    double salary;
    double totalSal;
    double finalSal;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void calculate(double allowance) {
        totalSal = salary + allowance;
    }

    void calculate(double allowance, double tax) {
        finalSal = (salary + allowance) - tax;
    }
    
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee Basic salary: " + salary);
        System.out.println("Employee Gross Salary: " + totalSal);
        System.out.println("Employee Final Salary: " + finalSal);
    }


}

class EmployeeManagementSystem 
{
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        int totalEmployees = 0;

        emp[0] = new Employee(101, "Sumit", 30000);
        totalEmployees++;
        
        emp[1] = new Employee(102, "Manish", 45000);
        totalEmployees++;
        
        emp[2] = new Employee(103, "PAvan", 55000);
        totalEmployees++;

        
        System.out.println("===============Empolye Details================");
        emp[0].calculate(2000); 
        emp[0].calculate(2000, 3000);
        emp[0].display();
        System.out.println("----------------------------------------------");
        emp[1].calculate(5000); 
        emp[1].calculate(5000, 4000);
        emp[1].display();
        System.out.println("----------------------------------------------");
        emp[1].calculate(7000); 
        emp[1].calculate(7000, 6000);
        emp[1].display();
        System.out.println("=============================================");
        System.out.println("Total Employees Tracked: " + totalEmployees);
    }
}
