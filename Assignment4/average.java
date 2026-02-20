//Find the Average of Elements in an Array

import java.util.Scanner;
class average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int num: arr){
			sum += num;
		}
		int avg;
		avg = sum/5; 
		System.out.println("The average of the numbers is:"+avg);
	}
}