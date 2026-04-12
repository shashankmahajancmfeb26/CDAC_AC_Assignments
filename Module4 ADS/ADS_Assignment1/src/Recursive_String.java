import java.util.Scanner;
public class Recursive_String
{
	static String reverse(String str)
    {
        if(str == null || str.length()<=1)
        {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
	
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String: ");
    	String input = sc.nextLine(); 
    	System.out.println("Reverse String: " + reverse(input));
    }

}
