//Write a program to print multiplication table of a number.
import java.util.Scanner;
class Table{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		System.out.print("Where to Stop: ");
		int s = sc.nextInt();
		int mul = 1;
		for(int i=1;i<=s;i++){
			mul = n*i;
			System.out.println(n+" X "+i+ " = "+mul);		
		}
		
	}		
}
/*
Output:
Enter the Number: 5
Where to Stop: 15
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
5 X 11 = 55
5 X 12 = 60
5 X 13 = 65
5 X 14 = 70
5 X 15 = 75
*/