public class Factorial
{
	static int factorial(int n)
    {
        if(n<0) 
        {
            return -1;
        }
        if(n==0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
	
    public static void main(String args[])
    {
        int n = 10;
        int result = factorial(n);
        
        if(result==-1)
        {
            System.out.println("Factorial is not for Negative Numbers.");
        } 
        else
        {
            System.out.println("Factorial of " + n +" = " + result);
        }
    }

    
}
