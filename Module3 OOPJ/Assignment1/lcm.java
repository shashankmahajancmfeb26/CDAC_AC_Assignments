//Find LCM of two numbers.
class lcm{
	public static void main(String args[]){
		int a = 25; 
		int b = 75;
        	int lcm = (a>b) ? a:b;
	
	        while (true) {
        	    if (lcm%a==0 && lcm%b==0) {
                	System.out.println("LCM of "+a+" and "+b+" is "+lcm);
                	break;
            		}
            	lcm++;
        	}
	}	
}
//Output: LCM of 25 and 75 is 75