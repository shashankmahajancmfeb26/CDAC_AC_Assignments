//Count Positive and Negative Numbers in an Array

import java.util.Scanner;
class count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int j: arr){
			if(j>0){
				positive++;
			}
			else if (j<0){
				negative++;
			}
			else{
				zero++;	
			}	
		}
		System.out.println("Positive Numbers: "+positive);
		System.out.println("Negative Numbers: "+negative);
	}
}