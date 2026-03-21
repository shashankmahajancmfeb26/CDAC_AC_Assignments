/*Create a simple calculator using switch: 
○ Input: two numbers + operator 
○ Perform: +, -, *, / 
*/
import java.util.Scanner;
class calculator{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int a = sc.nextInt();

		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter Your Choice: ");
		int ch = sc.nextInt();
		int c;
		switch(ch){
		case 1:
			c= a+b;
			System.out.println("Addition is "+c);
		break;
		case 2:
			c= a-b;
			System.out.println("Subtraction is "+c);
		break;
		case 3:
			c= a*b;
			System.out.println("Multiplication is "+c);
		break;
		case 4:
			c= a/b;
			System.out.println("Division is "+c);
		break;
		default:
			System.out.println("Enter Valid Choice");
		break;
		}	
	}		
}

/*
1)Enter the First Number: 10
Enter the Second Number: 5
Enter Your Choice: 1
Addition is 15

2)Enter the First Number: 10
Enter the Second Number: 5
Enter Your Choice: 2
Subtraction is 5

3)Enter the First Number: 10
Enter the Second Number: 5
Enter Your Choice: 3
Multiplication is 50

4)Enter the First Number: 10
Enter the Second Number: 5
Enter Your Choice: 4
Division is 2

5)Enter the First Number: 10
Enter the Second Number: 5
Enter Your Choice: 5
Enter Valid Choice
*/