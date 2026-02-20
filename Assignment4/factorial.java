//Calculate the Factorial of a Number

import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b=1;
		for(int i=1; i<=a; i++){
			b *= i;
		}
		System.out.println("Factorial of "+a+" is "+b);
	}
}