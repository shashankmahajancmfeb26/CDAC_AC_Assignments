import java.util.Scanner;

class method{
	int a;
	int b;
	int c;
	void sumOfTwoNumbers(){
		c = a+b;
		System.out.println("The Sum of "+a+" and "+b+" is "+c);
	}

}
class sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		method m = new method();
		System.out.println("Enter First No: ");
		m.a = sc.nextInt();
		System.out.println("Enter Second No: ");
		m.b = sc.nextInt();
		m.sumOfTwoNumbers();
	}

}