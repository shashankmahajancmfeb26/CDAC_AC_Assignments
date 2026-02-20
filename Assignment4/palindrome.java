//  Check if a String is a Palindrome
import java.util.Scanner;
class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		String a = "";
		for(int i=0; i<s.length(); i++){
			a = s.charAt(i) + a;
		}
		System.out.println("The palindrome is "+a);
		if (s.equals(a)){
			System.out.println("The string '"+s+"' is a palindrome");	
		}
		else{
			System.out.println("The string '"+s+"' is not a palindrome");
		}	
		
		

	}
}