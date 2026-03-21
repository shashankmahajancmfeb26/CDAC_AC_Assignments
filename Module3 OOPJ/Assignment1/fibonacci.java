// Write a program to print Fibonacci series up to N terms
import java.util.Scanner;
class fibonacci{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci Series of " + n + " Number");
		for(int i=1;i<=n;i++){
			System.out.print(first+", ");
			int next = first + second;
			first = second;
			second = next; 
		}

		


	}		
}
/*
Output:
Enter the Number: 15
Fibonacci Series of 15 Number
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 
*/