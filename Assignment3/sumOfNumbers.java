// Calculate the Sum of Numbers from 1 to N (Using for Loop)
import java.util.Scanner;

class sum{
	int a;
	int b = 0;
	void calculateSum(){
		int i;
		for(i=1; i<=a; i++){
			 b+= i;
		}
		System.out.println("The sum of Number from 1 to "+ a+ " is "+b);
	}
}
class sumOfNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sum s = new sum();
		System.out.println("Enter the Number:");
		s.a = sc.nextInt();
		s.calculateSum();
	}

}