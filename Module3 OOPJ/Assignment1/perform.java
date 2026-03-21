/*Take two numbers (int and double) and perform: 
○ Addition 
○ Division 
○ Type casting result to int  */
class perform
{
	public static void main(String args[])
	{
		int a = 105;
		double b = 250.39;
		
		//Addition
		double c;
		c = a+b;

		//Division
		double d;
		d = b/a;
		
		//Type casting
		a = (int) b;
		System.out.println("Addition: "+ c);
		System.out.println("Division: "+ d);
		System.out.println("After Type Casting: "+ a);
	}
}
/*
Output:
Addition: 355.39
Division: 2.3846666666666665
After Type Casting: 250
*/