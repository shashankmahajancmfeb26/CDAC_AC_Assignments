//Find the Largest Element in an Array

import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		int a = arr[0];
		for(int j=0; j<arr.length; j++){
			if(arr[j]>a){
				a = arr[j];
			}
		}
		System.out.println("The largest element is:"+a);
	}
}