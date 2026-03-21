//Take user age and: 
//● Check eligibility for voting 

import java.util.Scanner;
class voting{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = sc.nextInt(); 
		if(age>=18)
            		System.out.println("Person is Eligible for Voting");
        	else
            		System.out.println("Person is Not Eligible for Voting");
	}		
}
/*
Output:
Enter Age: 25
Person is Eligible for Voting
*/