//Check whether a number is perfect number. 

class perfectnum{
	public static void main(String args[]){
		int a = 6;
    		int add = 0;
      		for(int i=1;i<a;i++){
         		if(a%i==0){
            			add = add + i;
         		}
      		}
      		boolean isPer = (add==a);
      		if(isPer)
         		System.out.println(a+" is a Perfect Number");
      	 	else
         		System.out.println(a+" is Not a Perfect Number");
	}
}
//Output: 6 is a Perfect Number