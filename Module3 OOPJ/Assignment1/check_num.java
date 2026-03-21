/*Write a program to check whether a number is: 
○ Positive 
○ Negative 
○ Zero
*/
import java.util.Scanner;
class check_num{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the Number:");
		a = sc.nextInt();
		if(a>0){
			System.out.println("Number is Positive");
		}
		else if(a<0){
			System.out.println("Number is Negative");
		}
		else{
			System.out.println("Number is Zero");
		}
	}		
}
/*
Output:
1)Enter the Number:
10
Number is Positive
2)Enter the Number:                  
0
Number is Zero
3)Enter the Number:
-10
Number is Negative       
*/