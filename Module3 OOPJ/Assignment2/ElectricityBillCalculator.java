import java.util.Scanner;
class ElectricityBillCalculator{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Customer Name: ");
		String cname = sc.nextLine();
		System.out.print("Enter the Customer Number: ");
		int cno = sc.nextInt();
		System.out.print("Enter the Unit Consumed: ");
		int unit = sc.nextInt();
		int amt = 0;
		if(unit<=100){
			amt = unit * 5;
		}
		else if(unit<=200){
			amt = (100*5)+((unit-100)*7);
		}
		else {
			amt = (100*5)+(100*7)+((unit-200)*10);	
		}
		
		double surcharge;
		double finalbill = 0.0;
		if(amt>1500){
			surcharge = amt*0.05;
			finalbill = amt+surcharge;
		}
		else{
			finalbill = amt;
		}
		System.out.println("Customer Name: "+cname);
		System.out.println("Customer Number: "+cno);
		System.out.println("Unit Consumed: "+unit);
		System.out.println("Monthly Electricity Bill: Rs."+finalbill);
		
	}		
}
