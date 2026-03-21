//Write a program to print multiplication table of a number.
import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int mul = 1;
		for(int i=1;i<=10;i++){
			mul = n*i;
			System.out.println(n+" X "+i+ " = "+mul);		
		}
		
	}		
}