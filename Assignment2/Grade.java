// Days of the Week
class Grade{
	public static void main(String [] Args){
		int math = 80;   //Marks in math
		int sci = 85;	//Marks in Science
		int his = 90;	//Marks in History
		int avg;
		avg= (math+sci+his)/3;
		System.out.println("Average Marks: "+avg);

		if(avg>=90){
			System.out.println("Grade A");			
		}
		else if(avg>=70 && avg<90){
			System.out.println("Grade B");
		}
		else if(avg>=50 && avg<70){
			System.out.println("Grade C");
		}
		else if(avg>=30 && avg<50){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Fail");	
		}


	}



}