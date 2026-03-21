//Write a program to find sum of even and odd numbers separately (1 to N).

class sumEvenOdd{
	public static void main(String args[])
	{
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				evenSum += i;
			}
			else{
				oddSum += i;
			}
		}
		System.out.println("Sum of Even Numbers:"+evenSum);
		System.out.println("Sum of Odd Numbers:"+oddSum);
	}		
}
/*
Output:
Sum of Even Numbers:650
Sum of Odd Numbers:625
*/