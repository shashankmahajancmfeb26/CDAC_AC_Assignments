/*Write a program to check whether a character is: 
● Vowel or consonant
*/
import java.util.Scanner;
class vowels{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			System.out.println("Character is Vowel");	
		}
		else{
			System.out.println("Character is Consonant");
		}
	}		
}

/*
Output
1) Enter the Character:
a
Character is Vowel
2) Enter the Character:
d
Character is Consonant
*/