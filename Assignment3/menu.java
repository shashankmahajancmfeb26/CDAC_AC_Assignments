// menu-driven Java program

import java.util.Scanner;
class allVar{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
}
class menu{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		allVar v = new allVar(); 
		System.out.println("Enter your Choice:");
		int choice = sc.nextInt();

		switch(choice){
			case 1:
				int math = 80;   //Marks in math
				int sci = 85;	//Marks in Science
				int his = 90;	//Marks in History
				int avg;
				avg= (math+sci+his)/3;
				System.out.println("Average Marks: "+avg);

				if(avg>=90){
					System.out.println("Grade A");			
				}
				else if(avg>=70 && avg<90){
					System.out.println("Grade B");
				}
				else if(avg>=50 && avg<70){
					System.out.println("Grade C");
				}
				else if(avg>=30 && avg<50){
					System.out.println("Grade D");
				}
				else{
					System.out.println("Fail");	
				}
			break;
			case 2:
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
			break;
			case 3:
				System.out.println("Enter your day number");
				int ch = sc.nextInt();
				switch(ch){
					case 1:
						System.out.println("The Day is Monday");
					break;
					case 2:
						System.out.println("The Day is Tuesday");
					break;
					case 3:
						System.out.println("The Day is Wedneday");
					break;
					case 4:
						System.out.println("The Day is Thrusday");
					break;
					case 5:
						System.out.println("The Day is Friday");
					break;
					case 6:
						System.out.println("The Day is Saturday");
					break;
					case 7:
						System.out.println("The Day is Sunday");
					break;
					default:
						System.out.println("Invalid Day Number");
					break;
					}
			break;
			case 4:
				System.out.println(v.a);
				System.out.println(v.b);
				System.out.println(v.c);
				System.out.println(v.d);
				System.out.println(v.e);		
				System.out.println(v.f);
				System.out.println(v.h);
			default:
				System.out.println("Exit");
		}
	}
}