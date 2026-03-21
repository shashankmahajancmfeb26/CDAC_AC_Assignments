//Find GCD of two numbers.

class gcd{
	public static void main(String args[]){
		int a = 72;
		int b = 64;
		int gcd = 1;	
		
		for(int i=1;i<=a && i<=b;++i){
			if(a%i==0 && b%i==0){
				gcd = i;
			}
			
		}
		System.out.println("GCD of "+a+" and "+b+" is "+gcd); 
	}
}
// Output: GCD of 72 and 64 is 8