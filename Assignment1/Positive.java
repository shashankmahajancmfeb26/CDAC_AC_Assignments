import java.util.Scanner;

class Positive {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		
		if(a>0){
			System.out.println("Number is Positive");
                       }
		else {
			System.out.println("Number is not Positive");
		     }
  }
}