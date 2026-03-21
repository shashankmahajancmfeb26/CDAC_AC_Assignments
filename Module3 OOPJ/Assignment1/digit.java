//Write a program to count digits in a number. 
import java.util.Scanner;
class digit{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n!=0){
			n /= 10;
			++count;		
		}
		System.out.print("Number of Digit: "+count);
	}		
}
/*
Output:
Enter the Number: 1256
Number of Digit: 4
*/