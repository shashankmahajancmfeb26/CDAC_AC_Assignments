//Write a program to print sum of first N natural numbers.
import java.util.Scanner;
class naturalNum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum += i;
		}
		System.out.print("Sum of First "+n+" Natural Numbers: "+sum);
	}		
}

/*
Output:
Enter the Range:50
Sum of First 50 Natural Numbers: 1275
*/