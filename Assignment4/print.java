//Print Numbers from 1 to N

import java.util.Scanner;
class print{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++){
			System.out.println(i);
		}
	}
}