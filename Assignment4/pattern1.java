//Pattern Program 1

class pattern1{
	public static void main(String[] args){
		int i; 
		int j;
		for(i=1; i<=5; i++){
			for(j=1; j<=i; j++){
				System.out.print(i);	
				if(j<i){
					System.out.print("*");	
				}
			}
		System.out.println();	
		}
		for(i=5; i>0; i--){
			for(j=1; j<=i; j++){
				System.out.print(i);
				if(j<i){
					System.out.print("*");	
				}
			}
		
		System.out.println();	
		}
		
		

	}
}