//Write a program to check whether a number is prime.

import java.util.Scanner;
class prime{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number.");
		int n = sc.nextInt();
		boolean flag = false;
		
		for(int i=2;i<=n/2;++i){
		if(n%i==0)
			flag = true;
			break;
		}
		if(!flag)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");		

	}		
}
/*
Output:
Enter the Number.7
7 is a prime number.

Enter the Number.10
10 is not a prime number.
*/