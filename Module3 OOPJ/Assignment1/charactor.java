/*Take a character input and print: 
○ Next character 
○ Previous character
*/
import java.util.Scanner;
class charactor{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char a;
		System.out.println("Enter the Character:");
		a = sc.next().charAt(0);
		System.out.println("Next Character:"+ ++a);
		a = --a;
		System.out.println("Previous Character:"+ --a);
		
	}		
}
/*
Output:
Enter the Character:
S
Next Character:
T
Previous Character:
S
*/