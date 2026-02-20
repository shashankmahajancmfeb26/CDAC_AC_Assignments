// Print Multiplication Table (Using for Loop)
import java.util.Scanner;

class multiplication{
	int a                                                                                ;

	void printMultiplicationTable(){
		for(int i=1; i<=10; i++){
			System.out.println("5 X "+i +"= "+(a*i));
		}
	}
}
class table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		multiplication m = new multiplication();
		System.out.println("Enter the Number:");
		m.a = sc.nextInt();
		m.printMultiplicationTable();
	}

}