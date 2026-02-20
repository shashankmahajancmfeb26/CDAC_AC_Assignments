import java.util.Scanner;

class Message {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		if(a>5 && a<12){
			System.out.println("Good Morning");
                       }
		else {
			System.out.println("This is not morning");
		     }
  }
}