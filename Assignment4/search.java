//Check if an Array Contains a Specific Element

import java.util.Scanner;
import java.util.Arrays;
class search{
	private static boolean isElementPresent(int[] arr, int key) {
        	return Arrays.asList(arr).contains(key);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		
		int key;
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search:");
		key = sc.nextInt();
				
		
		boolean b = isElementPresent(arr, key);
		
		if(b=true){
			System.out.println("Found");
		}				
		else{
			System.out.println("Not Found");
		}

	}
}