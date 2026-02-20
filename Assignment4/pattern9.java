//Pattern Program 9

class pattern9{
	public static void main(String[] args){
		int a = 1;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");				
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
		System.out.println();	
		}
		
		for(int i=4; i>=1; i--){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");				
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
		System.out.println();	
		}
		

	}
}