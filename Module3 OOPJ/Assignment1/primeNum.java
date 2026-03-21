//Print all prime numbers between 1 to 100.

class primeNum{
	public static void main(String args[])
	{
		System.out.println("Prime numbers between 1 and 100 are:");

        	for (int i=2;i<=100;i++){ 
            		boolean isPrime = true;
            		for (int j=2; j*j<=i;j++){ 
                		if (i%j==0){
                    			isPrime = false;
                    			break; 
                		}
            		}
            		if (isPrime) {
                	System.out.print(i+" ");
            		}
        	}
	}
}
/*
Prime numbers between 1 and 100 are:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/