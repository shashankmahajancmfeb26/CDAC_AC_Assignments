import java.util.Scanner;

class EmployeeSalarySlipGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Employee Details ---");
        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        String eid = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double sal = sc.nextDouble();

        double hra = 0.20 * sal;
        double da = 0.10 * sal;
        double pf = 0.08 * sal;
        double grossSal = sal + hra + da;  //Gross Salary
        double netSal = grossSal - pf;     //Net salary

        System.out.println("Monthly Salary Slip of Employee");
        System.out.println("----------------------------------------------");
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee ID   : "+eid);
        System.out.println("----------------------------------------------");
        System.out.println("Basic Salary: "+sal);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("Gross Salary: "+grossSal);
        System.out.println("PF Deduction: "+pf);
        System.out.println("Net Salary: "+netSal);
        System.out.println("----------------------------------------------");
    }
}
