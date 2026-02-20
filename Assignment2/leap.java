// Leap Year

import java.util.Scanner;
class leap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int a = sc.nextInt();

		if(a%400==0){
			System.out.println(a+" is a leap year");
		}
		else if(a%4==0 && a%100!=0){
			System.out.println(a+" is a leap year");	
		}
		else{
			System.out.println(a+" is not a leap year");	
		}
	}

}