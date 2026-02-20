// Simple Age Checker
import java.util.Scanner;

class check{
	int a;
	
	void checkAgeCategory(){
		if(a<18){
			System.out.println("You are a Minor");
		}
		else if(a>=18 && a<60){
			System.out.println("You are an Adult");
		}
		else{
			System.out.println("You are a Senior Citizen");
		}
	}

}
class age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		check c = new check();
		System.out.println("Enter your age: ");
		c.a = sc.nextInt();
		c.checkAgeCategory();
	}

}