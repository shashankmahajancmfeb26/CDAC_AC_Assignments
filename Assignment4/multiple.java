//Print Multiples of 3 between 1 and N

import java.util.Scanner;
class multiple{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++){
			if(i%3==0){
				System.out.print(i+" ");
			}
		}
	}
}