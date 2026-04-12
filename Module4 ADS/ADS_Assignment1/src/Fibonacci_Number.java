public class Fibonacci_Number 
{
	static int fibonacci(int n) {
        if(n<0)
        {
            return -1;
        }
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
	
    public static void main(String[] args)
    {
        int n = 10;
        int result = fibonacci(n);

        if (result==-1) {
            System.out.println("Fibonacci is not for Negative Numbers.");
        }
        else
        {
            System.out.println(n+"th Fibonacci Number: "+ result);
        }
    }

    
}
