//Print Even Numbers from 1 to N

import java.util.Scanner;
class even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();

		for(int i=1; i<=a; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}