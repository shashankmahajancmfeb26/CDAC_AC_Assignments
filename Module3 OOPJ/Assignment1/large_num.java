//Write a program to find the largest of three numbers.

class large_num{
	public static void main(String args[])
	{
		int a = 55;
		int b = 89;
		int c = 67;
		if(a>b && a<c){
			System.out.println(a +" is the Greatest Number");
		}
		else if(b>a && b>c){
			System.out.println(b +" is the Greatest Number");
		}
		else{
			System.out.println(c +" is the Greatest Number");
		}
	}		
}