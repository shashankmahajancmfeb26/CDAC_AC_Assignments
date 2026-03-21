//Write a program to check whether a number is Armstrong

class Armstrong{
	public static void main(String args[])
	{
		int n = 153;
		int orgNum, rem; 
		int res = 0;

        	orgNum = n;

        	while(orgNum!=0){
                	rem = orgNum%10;
            		res += Math.pow(rem, 3);
	            	orgNum /= 10;
        	}

        	if(res==n)
            		System.out.println(n+" is an Armstrong number.");
        	else
            		System.out.println(n+" is not an Armstrong number.");
			
	}		
}
//Output: 153 is an Armstrong number.