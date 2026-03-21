//Write a program to find largest digit in a number

import java.util.Scanner;
class largedigit{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int large = 0;
		int r;
		
		while(n>0){
			r = n%10;
			if(large<r){
				large =r;
			}
			n =n/10;
		}
		System.out.print("Largest Digit in a Number is "+large);

	}		
}
/*
Output:
Enter the Number: 1496
Largest Digit in a Number is 9
*/