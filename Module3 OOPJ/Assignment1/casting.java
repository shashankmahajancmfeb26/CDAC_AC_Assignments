/*
Write a program to convert: 
○ int → double 
○ double → int
*/	
class casting
{
	public static void main(String args[])
	{
		int a = 525;
		double b = 354.46;
		
				
		a = (int) b;
		b = a;
		System.out.println("Int to Double: "+ b);
		System.out.println("Double to int: "+ a);
	}
}
/*
Output:
Int to Double: 354.0
Double to int: 354
*/