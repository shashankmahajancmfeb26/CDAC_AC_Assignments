/*Write a program to swap two numbers: 
● With third variable 
● Without third variable
*/
class swapNum{
	public static void main(String args[])
	{
		int a = 25;
		int b = 30;
		int temp;

		System.out.println("Before Swap: \na = "+a+",b = "+b);
		temp = a;
		a = b;
		b = temp;
						
		System.out.println("After Swap With third variable: \na = "+a+", b = "+b);

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap Without third variable: \na = "+a+", b = "+b);
			

	}		
}
/*
Output:
Before Swap:
a = 25,b = 30
After Swap With third variable:
a = 30,b = 25
After Swap Without third variable:
a = 25,b = 30
*/