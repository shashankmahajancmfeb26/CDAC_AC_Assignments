// Reverse a String 

import java.util.Scanner;
class reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		String a = "";
		
		for(int i=0; i<s.length(); i++){
			a = s.charAt(i) + a;
		}
		System.out.println(a);

	}
}