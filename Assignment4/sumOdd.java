//Sum of Odd Numbers between 1 and N

import java.util.Scanner;
class sumOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = 0;
		for(int i=1; i<=a; i++){
			if(i%2!=0){
				b += i; 	
			}
		}
		System.out.println("The sum of odd numbers from 1 to "+a+" is: "+b);
	}
}