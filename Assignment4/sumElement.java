//Find the Sum of All Elements in an Array

import java.util.Scanner;
class sumElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int num: arr){
			sum += num;
		}
		System.out.println("The sum of all numbers is:"+sum);
	}
}