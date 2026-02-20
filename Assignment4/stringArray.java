//Print All Names in a String Array

import java.util.Scanner;
class stringArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.next();
		}

		for(String s: arr){
			System.out.println(s);
		}
	}
}