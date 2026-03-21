/*Create a menu-driven program: 
1. Add 
2. Subtract 
3. Exit 
*/
import java.util.Scanner;
class menuDriven{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Menu \n1. Add\n2.Subtract\n3.Exit");
		System.out.println("Enter Your Choice: ");
		int ch = sc.nextInt();

		int a,b,c;
	
		do{
		switch(ch){
		case 1:
			System.out.print("Enter the First Number: ");
			a = sc.nextInt();
			System.out.print("Enter the Second Number: ");
			b = sc.nextInt();
			c= a+b;
			System.out.println("Addition is "+c);
		break;
		case 2:
			System.out.print("Enter the First Number: ");
			a = sc.nextInt();
			System.out.print("Enter the Second Number: ");
			b = sc.nextInt();
			c= a-b;
			System.out.println("Subtraction is "+c);
		break;
		default:
			System.out.println("Exit........");
		break;
		}
		}while(ch>3);

		
	}		
}
/*
Output:
Menu
1. Add
2.Subtract
3.Exit
Enter Your Choice:
1
Enter the First Number: 12
Enter the Second Number: 12
Addition is 24
*/