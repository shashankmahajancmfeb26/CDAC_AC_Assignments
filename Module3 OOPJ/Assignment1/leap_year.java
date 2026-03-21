//Write a program to check whether a year is a leap year. 

import java.util.Scanner;
class leap_year{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();

		if(year%400==0){
			System.out.println(year+" is a leap year");
		}
		else if(year%4==0 && year%100!=0){
			System.out.println(year +" is a leap year");	
		}
		else{
			System.out.println(year +" is not a leap year");	
		}
	}

}
/*
Output:
1)Enter the Year:
2024
2024 is not the Leap Year

2)Enter the Year:
1900
1900 is not a leap year
*/