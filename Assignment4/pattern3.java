//Pattern Program 3

class pattern3{
	public static void main(String[] args){
		
		for(int i=1; i<=5; i++){
			int n = 1;
			for(int j=1; j<=i; j++){
				System.out.print(n);
				n += 2; 
				if(j<i){
					System.out.print("*");
				}
			}
		System.out.println();	
		}
		
		

	}
}