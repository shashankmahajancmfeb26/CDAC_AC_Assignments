import java.util.Scanner;

class Largest {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int n3 = sc.nextInt();
		if(n1>n2){
			if(n1>n3){
				System.out.println("Largest Number is " + n1);
			}
			else
			{
				System.out.println("Largest Number is " + n3);   
			}
		}
		else
		{
			if(n2>n3){
				System.out.println("Largest Number is " + n2);
			}
			else{
				System.out.println("Largest Number is " + n3);
			}
		}
	}
}