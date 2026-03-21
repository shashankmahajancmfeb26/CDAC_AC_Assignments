//Write a program to find factorial of a number.
import java.util.Scanner;
class factorial{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		long fact = 1;
		for(int i=1;i<=n;i++){
			fact *= i;
		}

		System.out.print("Factorial is: "+fact);
	}		
}
/*
Output:
Enter the Number: 10
Factorial is: 3628800
*/