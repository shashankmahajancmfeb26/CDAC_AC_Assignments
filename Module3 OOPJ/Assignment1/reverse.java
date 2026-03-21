//Write a program to reverse a number.
import java.util.Scanner;
class reverse{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println("Original Number: "+n);
		int rev = 0;
		int b;
		while(n>0){
			b= n%10;
			rev = (rev*10)+b;
			n = n/10;		
		}
		System.out.println("Reverse Number: "+rev);
		
	}		
}
/*
Output:
Enter the Number: 12345
Original Number: 12345
Reverse Number: 54321
*/