// Write a program to check whether a number is palindrome.
import java.util.Scanner;
class palindrome{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println("Original Number: "+n);
		int org = n;
		int rev = 0;
		int b;
		while(n>0){
			b= n%10;
			rev = (rev*10)+b;
			n = n/10;		
		}
		System.out.println("Reverse Number: "+rev);
		if (org ==rev)
			System.out.println("Number is Palindrome...");
		else
			System.out.println("Number is Not Palindrome...");
	}		
}
/*
Enter the Number: 121
Original Number: 121
Reverse Number: 121
Number is Palindrome...

Enter the Number: 1256
Original Number: 1256
Reverse Number: 6521
Number is Not Palindrome...
*/