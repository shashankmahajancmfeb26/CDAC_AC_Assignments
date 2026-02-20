// User Input for Positive Numbers (Using do-while Loop)
import java.util.Scanner;

class ask{
	int num;
	int askForPositiveNumber(Scanner sc){
		do{
			System.out.println("Enter the Positive Number:");
			if(sc.hasNextInt()){
				num = sc.nextInt();			
				
			}
		}	
		while(num<=0);
	return num;
	}

}
class positiveNumber{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		ask a = new ask();
		int x = a.askForPositiveNumber(sc);	
		System.out.println("You entered the Positive Number:" + x);	
	}
}