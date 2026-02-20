//Find the Index of an Element in an Array

import java.util.Scanner;
import java.util.Arrays;
class binary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search:");
		int a = sc.nextInt();
		
		int x = Arrays.binarySearch(arr, a);
		if(x>=0){
			System.out.println("The number "+ a +" is found at index "+x);
		}				
		else{
			System.out.println("Not Found");
		}

	}
}